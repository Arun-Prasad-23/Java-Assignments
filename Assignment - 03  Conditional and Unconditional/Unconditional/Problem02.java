//  Write a program to print prime numbers between 1 to 30
import java.util.*;
public class Problem02 {
  public static boolean isPrime(int n){
  if(n < 2) return false;
  for(int i = 2; i <= (int)Math.sqrt(n); i++){
    if(n%i == 0)
    return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i = 1; i <= 30; i++){
      if(isPrime(i))
      System.out.print(i+" ");
    }
  }
}
