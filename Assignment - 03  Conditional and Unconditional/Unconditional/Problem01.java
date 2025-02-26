// Write a program to find second occurrence of a given number in an array
import java.util.*;
public class Problem01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < 10; i++)
    a[i] = sc.nextInt();
    int target = sc.nextInt();
    boolean found = false;
    for(int i = 0; i < a.length; i++){
      if(found && a[i] == target){
        System.out.print(a[i]+" as occured second time in the array");
        return;
      }
      if(a[i] == target)
      found = true;
    }
    System.out.println(target+ " has not occured two times");
  }
}

