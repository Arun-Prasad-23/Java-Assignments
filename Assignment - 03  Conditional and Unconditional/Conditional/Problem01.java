package Conditional;
// Take three numbers from the user and print the greatest number.
import java.util.*;

public class Problem01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println((a>b&&a>c)?a:(b > c)?b:c);
  }
}
