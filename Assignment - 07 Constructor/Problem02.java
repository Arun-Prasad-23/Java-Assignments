import java.util.*;
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
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[4];
    for(int i = 0; i < 4; i++){
      int id = sc.nextInt();
      String name = sc.next();
      String department = sc.next();
      double salary = sc.nextDouble();
      emp[i] = new Employee(id, name, department, salary);
    }
    for(int i = 0; i < 4; i++){
      System.out.println(emp[i].getName());
    }
  }
}
