import java.util.*;
class Book{
  private String title;
  private String author;
  private String isbn;
  private double price;

  private static int totalBooks = 0;
  
  public Book(String title, String author, String isbn, double price){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
    totalBooks++;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public String getTitle(){
    return title;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public String getAuthor(){
    return author;
  }
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }
  public String getIsbn(){
    return isbn;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public double getPrice(){
    return price;
  }
  public int getTotalBooks(){
    return totalBooks;
  }
}
class Problem01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Book arr[] = new Book[4];
    for(int i = 0; i < 4; i++){
      String title = sc.next();
      String author = sc.next();
      String isbn = sc.next();
      Double price = sc.nextDouble();
      arr[i] = new Book(title, author, isbn, price);
    }
    for(int i = 0; i < 4; i++){
      System.out.println(arr[i].getTitle());
    }

  }
}