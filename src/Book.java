import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}
