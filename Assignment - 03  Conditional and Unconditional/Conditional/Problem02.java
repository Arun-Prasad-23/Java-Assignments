package Conditional;
// Create a program that takes a student's score as input and outputs their corresponding grade.
import java.util.*;
public class Problem02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    char grade;
    if(score >= 90)
    grade = 'A';
    else if(score >= 80)
    grade = 'B';
    else if(score >= 70)
    grade = 'C';
    else if(score >= 60)
    grade = 'D';
    else if(score >= 50)
    grade ='E';
    else 
    grade = 'F';
    System.out.println("Grade: "+grade);
  }
}

