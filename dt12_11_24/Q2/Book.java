package nareshit.lab.dt12_11_24.Q2;

public class Book extends LibraryItem{

    String author;
     void displayBookInfo()
     {
         super.displayInfo();
         System.out.println("Author :"+author);
     }

     public Book(String title,String author)
     {
         super(title);
         this.author=author;
     }
}
