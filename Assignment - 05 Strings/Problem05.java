import java.util.*;
public class Problem05{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder res = new StringBuilder(str);
    res.setCharAt(0, Character.toUpperCase(res.charAt(0)));
    for(int i = 0; i < res.length(); i++){
      if(res.charAt(i)==' '){
        res.setCharAt(i+1, Character.toUpperCase(res.charAt(i+1)));
      }
    }
    System.out.println(res.toString());
  }
}

