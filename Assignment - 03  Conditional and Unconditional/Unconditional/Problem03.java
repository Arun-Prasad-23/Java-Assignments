//  Write a program to find the sum of even numbers only in a given array. Use continue
import java.util.*;
public class Problem03 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int evenSum = 0;
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
      if(arr[i] % 2 != 0)
      continue;
      evenSum += arr[i];
    }
    System.out.println(evenSum);
  }
}
