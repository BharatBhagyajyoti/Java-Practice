package nareshit.lab.dt12_11_24.Q2;

public class LibraryItem {
    String title;

    void displayInfo()
    {
        System.out.println("Title :"+title);
    }

    public LibraryItem(String title) {
        this.title = title;
    }
}
