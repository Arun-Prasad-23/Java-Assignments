// Write a program to reverse the characters of a string.
import java.util.*;
public class Problem02 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      StringBuilder res = new StringBuilder(str);
      res = res.reverse();
      System.out.print(res.toString());
  }
}
