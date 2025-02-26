// Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
public class Problem03 {
  public static void main(String[] args) {
    int a = 32, b = 4;
    System.out.println(a&b);// AND Operator
    System.out.println(a|b);// OR Operator
    System.out.println(a^b);// XOR Operator
    System.out.println(~a); // Complement Operator
    System.out.println(a>>b);// Right Shift Operator
    System.out.println(a<<b); // Left Shift Operator
    System.out.println(a>>>b); // Unsigned Right Shift Operator 
  }
}

