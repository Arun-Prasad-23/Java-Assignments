// Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() . Implement method overloading to allow these operations for integers, doubles, and optionally, other types.
class MathOperations {
  public int add(int a, int b) {
    return a + b;
  }
  public double add(double a, double b) {
    return a + b;
  }
  public int subtract(int a, int b) {
    return a - b;
  }
  public double subtract(double a, double b) {
    return a - b;
  }
  public int multiply(int a, int b) {
    return a * b;
  }
  public double multiply(double a, double b) {
    return a * b;
  }
  public int divide(int a, int b) {
    return a / b;
  }
  public double divide(double a, double b) {
    return a / b;
  }
}
public class Problem01 {
  public static void main(String[] args) {
    MathOperations math = new MathOperations();
    System.out.print(math.add(5, 3)+" ");
    System.out.print(math.add(3.5,2.5));
  }
}