// Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.//
import java.util.*;
public class Problem02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    
    double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("Two distinct real roots: %.2f and %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("One real repeated root: %.2f%n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Complex roots: %.2f + %.2fi and %.2f - %.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
  }
}

