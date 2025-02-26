//  Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
public class Problem04{
  public static void main(String[] args) {
    int outsideVariable = 10;
    if(true){
      int insideVariable =  20;
      System.out.println("Inside the block - outside variable: "+outsideVariable+" inside variable: "+insideVariable);
    }
    System.out.print("Outside the block ");
    System.out.print(" outside Variable: "+outsideVariable);
    // System.out.print("inside Varible: "+ insideVariable);
    //-> complier error insideVaribale cannot find symabl
  }
}
