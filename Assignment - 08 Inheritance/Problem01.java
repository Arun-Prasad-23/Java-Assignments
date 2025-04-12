//  Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
class Shape{
  public double area(){
    System.out.print("Area of Shape ");
    return 0;
  }
  public double perimeter(){
    System.out.print("Perimeter of Shape ");
    return 0;
  }
}
class Circle extends Shape{
  private double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  public double area(){
    return Math.PI * radius * radius;
  }
  public double perimeter(){
    return 2 * Math.PI * radius;
  }
}
class Rectangle extends Shape{
  private double length;
  private double breadth;
  public Rectangle(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
  }
  public double area(){
    return length * breadth;
  }
  public double perimeter(){
    return 2 * (length + breadth);
  }
}
class Square extends Shape{
  private double side;
  public Square(double side){
    this.side = side;
  }
  public double area(){
    return side * side;
  }
  public double perimeter(){
    return 4 * side;
  }
}
class Problem01{
  public static void main(String[] args){
    Shape s = new Shape();
    System.out.println(s.area());
    System.out.println(s.perimeter());
    Circle c = new Circle(5);
    System.out.println("Area of Circle: " + c.area());
    System.out.println("Perimeter of Circle: " + c.perimeter());
    Rectangle r = new Rectangle(5, 10);
    System.out.println("Area of Rectangle: " + r.area());
    System.out.println("Perimeter of Rectangle: " + r.perimeter());
    Square sq = new Square(5);
    System.out.println("Area of Square: " + sq.area());
    System.out.println("Perimeter of Square: " + sq.perimeter());
  }
}