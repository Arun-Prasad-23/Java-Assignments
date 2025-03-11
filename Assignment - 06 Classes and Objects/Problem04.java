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
public class Problem04 {
  public static void main(String[] args) {
    Movie m1 = new Movie("Avatar", "James Cameron", "adventure");
    Movie m2 = new Movie("Interstellar", "Christopher Nolan", "science-fiction");
    System.out.println(m1.getName()+" "+m1.getDirector()+" "+m1.getGenres());
    System.out.print(m2.getTotalMovies());
  }
}
