/*Initialize a jagged array with N rows with weights of N persons. Each person can have different number of weights. Write
      (a). A function to enter the weight of any user at any time.
      (b). A function to calculate the minimum weight of the nth person*/
import java.util.*;
public class Problem05 {
  static Scanner sc = new Scanner(System.in);
  public static void addWeight(double[][] weights) {
    int person = sc.nextInt();

    double newWeight = sc.nextDouble();
    double[] newWeights = new double[weights[person].length + 1];

    // Copy old weights
    for (int i = 0; i < weights[person].length; i++) {
      newWeights[i] = weights[person][i];
    }

    // Add new weight
    newWeights[newWeights.length - 1] = newWeight;
    weights[person] = newWeights;
  }
  public static void findMinWeight(double[][] weights) {
    int person = sc.nextInt();
    double minWeight = weights[person][0];
    for (double w : weights[person]) {
      if (w < minWeight) {
        minWeight = w;
      }
    }
    System.out.println("Minimum weight of person " + person + " is: " + minWeight);
  }
  public static void main(String[] args) {
    int n = sc.nextInt();
    double[][] weights = new double[n][];
    for (int i = 0; i < n; i++) {
      int ct = sc.nextInt();
      weights[i] = new double[ct];
      for (int j = 0; j < ct; j++) {
        weights[i][j] = sc.nextDouble();
      }
    }
    addWeight(weights);
    findMinWeight(weights);
  }
}

