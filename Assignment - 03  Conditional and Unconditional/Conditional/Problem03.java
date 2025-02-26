package Conditional;
// Write a program to print multiplication table of a given number in a neat format
import java.util.*;
public class Problem03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= 10; i++)
    System.out.println(n+" x "+i+" = "+n*i);
  }
}

