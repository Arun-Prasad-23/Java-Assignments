// Write a program to implement matrix multiplication
import java.util.*;
public class Problem03 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int row1 = sc.nextInt(), col1 = sc.nextInt();
    int matA[][] = new int[row1][col1];
    for(int i = 0; i < row1; i++)
    for(int j = 0; j < col1; j++)
    matA[i][j] = sc.nextInt();

    int row2 = sc.nextInt(), col2 = sc.nextInt();
    int matB[][] = new int[row2][col2];
    for(int i = 0; i < row2; i++)
    for(int j = 0; j < col2; j++)
    matB[i][j] = sc.nextInt();

    int res[][] = new int[row1][col2];
    for(int i = 0; i < row1; i++)
    for(int j = 0; j < col2; j++)
    for(int k = 0; k < col1; k++) 
    res[i][j] += matA[i][k] * matB[k][i];

    System.out.println("Matrix Multiplication");
    for(int i = 0; i < row1; i++){
      for(int j= 0; j < col2; j++){
        System.out.print(res[i][j]+" ");
      }
      System.out.println();
    }
  }
}
