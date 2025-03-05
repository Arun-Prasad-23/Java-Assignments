//  https://exercism.org/tracks/java/exercises/squeaky-clean
import java.util.*;
public class Problem06 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String identifier = sc.nextLine();
    identifier = identifier.replace(" ", "_");
    identifier = identifier.replace('0', 'o').replace('1', 'l').replace('3', 'e').replace('4', 'a').replace('7', 't');
    StringBuilder str = new StringBuilder(identifier);
    for (int i = 0; i < identifier.length(); i++) {
      if (identifier.charAt(i) == '-') {
        str.deleteCharAt(i);
        char x = Character.toUpperCase(str.charAt(i));
        str.setCharAt(i, x);
        identifier = str.toString();
      }
    }
    StringBuilder res = new StringBuilder(identifier);
    for (int i = 0; i < identifier.length(); i++) {
      if (!Character.isLetterOrDigit(identifier.charAt(i)) && identifier.charAt(i) != '_') {
        res.deleteCharAt(i);
        --i;
      }
      identifier = res.toString();
    }
    System.out.println(identifier);
  }
}
