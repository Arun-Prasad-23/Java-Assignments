// Create a program to count vowels in a given string using string functions
import java.util.*;
public class Problem01 {
  public static boolean isVowel(char ch){
    ch = Character.toLowerCase(ch);
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int count = 0;
    for(char ch: str.toCharArray()){
      if(isVowel(ch))
      count += 1;
    }
    System.out.println(count) ;
  }
}
