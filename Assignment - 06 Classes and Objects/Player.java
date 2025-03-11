public class Player {
  private String name;
  private String position;
  private int jerseyNumber;
  
  public Player(String name, String position, int jerseyNumber){
    this.name = name;
    this.position = position;
    this.jerseyNumber = jerseyNumber;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setPosition(String position){
    this.position = position;
  }
  public String getPosition(){
    return position;
  }
  public void setJerseyNumber(int jerseyNumber){
    this.jerseyNumber = jerseyNumber;
  }
  public int getJerseyNumber(){
    return jerseyNumber;
  }
  public void playGame(){
    System.out.println(name+" is playing game");
  }
  public void train(){
    System.out.println(name+" is training");
  }
}
