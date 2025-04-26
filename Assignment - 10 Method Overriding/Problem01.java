//  Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails. Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", ID: " + id;
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
class SalariedEmployee extends Employee {
    double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}
public class Problem01 {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("naveen", 101, 20.0, 40);
        Employee emp2 = new SalariedEmployee("Arun Prasad", 102, 60000.0);

        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
    }
}