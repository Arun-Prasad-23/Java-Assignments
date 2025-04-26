//  Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.

class Movie {
    String title;
    String director;
    int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public void play() {
        System.out.println("Playing movie: " + title);
    }
}
class RomComMovie extends Movie {
    public RomComMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    public void play() {
        System.out.println("Playing romantic comedy: " + title);
    }
}
class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    public void play() {
        System.out.println("Playing thriller: " + title);
    }
}
class ActionMovie extends Movie {
    public ActionMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    public void play() {
        System.out.println("Playing action movie: " + title);
    }
}
class HorrorMovie extends Movie {
    public HorrorMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    public void play() {
        System.out.println("Playing horror movie: " + title);
    }
}
class DramaMovie extends Movie {
    public DramaMovie(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    public void play() {
        System.out.println("Playing drama: " + title);
    }
}

public class Problem03 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        movies[0] = new RomComMovie("OK Kanmani", "Mani Ratnam", 2015);
        movies[1] = new ThrillerMovie("Ratsasan", "Ram Kumar", 2018);
        movies[2] = new ActionMovie("Kaithi", "Lokesh Kanagaraj", 2019);
        movies[3] = new HorrorMovie("Pizza", "Karthik Subbaraj", 2012);
        movies[4] = new DramaMovie("Pariyerum Perumal", "Mari Selvaraj", 2018);
        for (Movie movie : movies) {
            movie.play();
        }
    }
} 
