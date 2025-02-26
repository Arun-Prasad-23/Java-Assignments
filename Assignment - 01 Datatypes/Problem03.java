// MainClassDemo.java
public class Problem03 {
    public static void main(String[] args) {
        System.out.println("Inside Problem03.");
        A a = new A();
        a.display();
        
        B b = new B();
        b.show();
    }
}

class A {
    void display() {
        System.out.println("Inside class A.");
    }
}

class B {
    void show() {
        System.out.println("Inside class B.");
    }
}

