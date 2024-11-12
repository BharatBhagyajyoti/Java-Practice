package nareshit.lab.dt12_11_24.Q2;

public class Ebook extends Book{

    String fileFormat;
    void displayEbookInfo()
    {
        super.displayBookInfo();
        System.out.println("File format :"+fileFormat);
    }

    public Ebook(String title,String author,String fileFormat) {
        super(title,author);
        this.fileFormat = fileFormat;
    }
}
