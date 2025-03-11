import java.util.*;
public class Problem05 {
  public static void main(String[] args) {
    Player player1 = new Player("Dhoni", "wicket-keeper", 10);
    Player player2 = new Player("Jadeja", "All-rounder", 8);
    Team team = new Team("Chennai Super Kings", "chennai", "south", Arrays.asList(player1, player2));  
    player2.train();
    System.out.println(team.players.get(0).getName());
  }
  
}
