class Flight{
  private int id;
  private String name;
  private int noOfSeats;
  private static int totalFlights = 0;

  public Flight(int id, String name, int noOfSeats){
    this.id = id;
    this.name = name;
    this.noOfSeats = noOfSeats;
    totalFlights++;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return id;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setNoOfSeats(int noOfSeats){
    this.noOfSeats = noOfSeats;
  }
  public int getNoOfSeats(){
    return noOfSeats;
  }
  public int getTotalFlights(){
    return totalFlights;
  }
}
public class Problem03 {
  public static void main(String[] args) {
    Flight f1 = new Flight(1, "Air-India",50);
    Flight f2 = new Flight(2, "Vistara", 60);
    System.out.print(f1.getName()+" "+f2.getTotalFlights()); 
  }
}
