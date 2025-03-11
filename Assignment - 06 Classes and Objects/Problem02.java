class Employee{
  private int id;
  private String name;
  private String department;
  private double salary;

  private static int totalEmployees = 0;

  public Employee(int id, String name, String department, double salary){
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
    totalEmployees++;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setDepartment(String department){
    this.department = department;
  }
  public String getDepartment(){
    return department;
  }
  public void setSalary(double salary){
    this.salary = salary;
  }
  public double getSalary(){
    return salary;
  }
  public int getTotalEmployees(){
    return totalEmployees;
  }
} 
public class Problem02 {
  public static void main(String[] args) {
    Employee e1 = new Employee(1,"Arun", "IT", 75000);
    Employee e2 = new Employee(2, "Naveen", "HR", 60000);
    System.out.print(e1.getTotalEmployees()+" "+e2.getName());
  }
}
