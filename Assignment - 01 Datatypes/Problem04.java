public class Problem04 {
  public static void main(String[] args) {
    int a = 5, b = 7;
    System.out.println("Value of a "+a+" and Value of b "+b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("Swapped values of a "+a+" and b "+b);
  }
}
