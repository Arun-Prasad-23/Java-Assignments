// Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user
import java.util.*;
public class Problem01 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    arr[i] = sc.nextInt();
    int rr = sc.nextInt();
    rr = rr % n;
    int rotateArr[] = new int[n];
    for(int i = 0; i < n; i++)
    rotateArr[(i+rr)%n] = arr[i];
    for(int i = 0; i < n; i++)
    System.out.print(rotateArr[i]+" ");
  }
}
