public class Problem02 {
  public static void main(String[] args) {
    
    float floatValue = 12.56f;
    int intFromFloat = (int)floatValue;//Explicit conversion 
    System.out.println("float value "+floatValue);
    System.out.println("float to int "+intFromFloat);

    double doubleValue = 12.3456;
    float floatFromDouble = (float) doubleValue;// Explicit conversion
    System.out.println("double value "+ doubleValue);
    System.out.println("double to float "+ floatFromDouble);

    int intValue = 200;
    short shortFromInt = (short) intValue;//Explicit conversion
    System.out.println("int value "+ intValue);
    System.out.println("int to short "+ shortFromInt);
    
  }
}

