//  Create Vehicle Hierarchy
class Vehicle {
  String name;
  Vehicle(String name) {
    this.name = name;
  }
}
class TwoWheeler extends Vehicle {
  String type;
  TwoWheeler(String name, String type) {
    super(name);
    this.type = type;
  }
}
class FourWheeler extends Vehicle {
  String type;
  FourWheeler(String name, String type) {
    super(name);
    this.type = type;
  }
}
class Problem03{
  public static void main(String[] args) {
    Vehicle v = new Vehicle("Vehicle");
    System.out.println(v.name);
    TwoWheeler tw = new TwoWheeler("TwoWheeler", "Bike");
    System.out.println(tw.name + " " + tw.type);
    FourWheeler fw = new FourWheeler("FourWheeler", "Car");
    System.out.println(fw.name + " " + fw.type);
    Vehicle v1 = new TwoWheeler("TwoWheeler", "Bike");
    System.out.println(v1.name);
  }
}
