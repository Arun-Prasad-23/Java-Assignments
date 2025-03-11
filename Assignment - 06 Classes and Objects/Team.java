import java.util.*;
public class Team {
  private String name;
  private String city;
  private String division;
  List<Player> players;

  public Team(String name, String city, String division, List<Player> players){
    this.name = name;
    this.city = city;
    this.division = division;
    this.players = players;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setCity(String city){
    this.city = city;
  }
  public String getCity(){
    return city;
  }
  public void setDivision(String division){
    this.division = division;
  }
  public String getDivision(){
    return division;
  }
  public void setPlayers(List<Player>players){
    this.players = players;
  }
  public List<Player>getPlayers(){
    return players;
  }
  public void playGame(){
    System.out.println(name+" is playing a game");
  }
  public void hireCoach(){
    System.out.println(name+ " is training");
  }
}
