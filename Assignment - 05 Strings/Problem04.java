// Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
import java.util.*;
public class Problem04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    String email = sc.nextLine();
    int atInd = email.indexOf("@");
    int lastAtInd = email.lastIndexOf("@");
    if(atInd <= 0 || atInd != lastAtInd || atInd == email.length()-1){
      System.out.print("It's not a valid email");
      return;
    }
    String domain = email.substring(atInd);
    int dotInd = email.indexOf(".");
    if(dotInd <= 0 || dotInd == domain.length()-1 || domain.length() < 3){
      System.out.print("It's not a valid email");
      return;
    }
    System.out.print("It's a valid mail");
  }
}
