// Write a program to find transpose of a matrix
import java.util.*;
public class Problem02 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int row = sc.nextInt(), col = sc.nextInt();
    int mat[][] = new int[row][col];
    for(int i = 0; i < row; i++)
    for(int j = 0; j < col; j++)
    mat[i][j] = sc.nextInt();

    int trans[][] = new int[col][row];
    for(int i = 0; i < row; i++)
    for(int j = 0; j < col; j++)
    trans[j][i] = mat[i][j];

    System.out.println("Transpose Matrix");
    for(int i = 0; i < col; i++){
      for(int j = 0; j < row; j++){
        System.out.print(trans[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}
