import java.util.*;
public class Problem06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int TOTAL_PERSONS = 10;
    double totalWeight = 0.0; 
    for(int i=1; i <= TOTAL_PERSONS; i++){
      double person = sc.nextDouble();
      totalWeight += person;
    }
    double averageWeight = totalWeight/TOTAL_PERSONS;
    System.out.println(averageWeight);
  }
}

