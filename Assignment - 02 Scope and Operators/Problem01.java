// Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
import java.util.*;
public class Problem01 {
  public static void main(String[] args) {
    final double CONVERSION_FACTOR = 1.8;
    final int OFFSET = 32; 
    Scanner sc = new Scanner(System.in);
    double celsiusTemperature = sc.nextDouble();
    double fahrenheitTemperature = (celsiusTemperature * CONVERSION_FACTOR) + OFFSET;// f = (c*1.8)+32
    System.out.printf("%.2f celsius is equal to %.2f fahrenheit",celsiusTemperature,fahrenheitTemperature);
  }
}
