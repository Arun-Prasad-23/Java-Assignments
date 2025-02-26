import java.util.*;
public class Problem05 {
  enum weekDay{
      Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturdat
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dayNum = sc.nextInt();
    if(1 <= dayNum  && dayNum <= 7)
    System.out.println(weekDay.values()[dayNum-1]);
    else
    System.out.println("Invalid input!");
  }
}
