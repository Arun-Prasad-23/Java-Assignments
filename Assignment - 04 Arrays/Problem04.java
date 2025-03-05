// Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix
import java.util.*;
public class Problem04 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ct = 1;
    int spiralMat[][] = new int[n][n];

    for(int i = 0; i < n/2; i++){
      for(int j = i; j < n-i-1; j++)
      spiralMat[i][j] = ct++;
      for(int j = i; j < n-i-1; j++)
      spiralMat[j][n-1-i] = ct++;
      for(int j = n-i-1; j >= i+1; j--)
      spiralMat[n-1-i][j] = ct++;
      for(int j = n-i-1; j >= i+1; j--)
      spiralMat[j][i] = ct++;
    }
    if(n%2!= 0) 
    spiralMat[n/2][n/2] = ct;
    System.out.println("Spiral Matrix");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print(spiralMat[i][j]+" ");
      }
      System.out.println();
    }
  }
}


