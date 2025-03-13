import java.util.*;
class Movie{
  private String name;
  private String director;
  private String genres;

  private static int totalMovies = 0;

  public Movie(String name, String director, String genres){
    this.name = name;
    this.director = director;
    this.genres = genres;
    totalMovies++; 
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setDirector(String director){
    this.director = director;
  }
  public String getDirector(){
    return director;
  }
  public void setGenres(String genres){
    this.genres = genres;
  }
  public String getGenres(){
    return genres;
  }
  public int getTotalMovies(){
    return totalMovies;
  }
}
public class Problem03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Movie movie[] = new Movie[4];
    for(int i = 0; i < 4; i++){
      String name = sc.next();
      String director = sc.next();
      String genres = sc.next();
      movie[i] = new Movie(name, director, genres);
    }
    for(int i = 0; i < 4; i++)
    System.out.println(movie[i].getName());
  }
}
