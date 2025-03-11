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
public class Problem01{
  public static void main(String[] args) {
    Book b1 = new Book("JAVA THE COMPLETE REFERENCE", "Herbert Schildt", "978-9355326478", 1287);
    Book b2 = new Book("Head First Java", "Kathy Sierra", "978-9355420909", 1850);
    System.out.print(b1.getTitle()+" "+b1.getTotalBooks()+" "+b2.getTotalBooks());
  }
}