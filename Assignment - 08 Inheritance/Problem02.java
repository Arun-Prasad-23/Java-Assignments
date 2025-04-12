// Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor.  Try experimenting by creating child object using parent constructor.
class Student {
  String name;
  int age;
  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
class ZSGSStudent extends Student {
  String school;
  ZSGSStudent(String name, int age, String school) {
    super(name, age);
    this.school = school;
    }
  }
class Problem02 {
  public static void main(String[] args) {
    Student s = new Student("Arun", 20);
    System.out.println(s.name + " " + s.age);
    ZSGSStudent zs = new ZSGSStudent("Gogul", 21, "ZSGS");
    System.out.println(zs.name + " " + zs.age + " " + zs.school);
    Student s1 = new ZSGSStudent("Saran", 22, "ZSGS");
    System.out.println(s1.name + " " + s1.age);
  }
}
