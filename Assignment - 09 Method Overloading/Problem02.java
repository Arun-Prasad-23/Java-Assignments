//  Create a class named Person. Overload the constructors such that first constructor takes a single String argument for the name, second takes a String argument for the name and an int argument for the age and third constructor takes a String argument for the name, an int argument for the age, and a String argument for the address. Create a Main class with a main method to test the Person class by creating objects using each constructor and printing their details.
class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name) {
        this.name = name;
        this.age = 0; 
        this.address = "";
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "";
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
public class Problem02 {
    public static void main(String[] args) {
        Person person1 = new Person("Arun");
        Person person2 = new Person("Arun", 21);
        Person person3 = new Person("Arun", 21, "123 Main St");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
