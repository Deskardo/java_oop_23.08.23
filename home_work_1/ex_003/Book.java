package home_work_1.ex_003;

public class Book {
    private String title;
    private String author;
    private boolean available;

    // базовый конструктор
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // гетер названия
    public String getTitle() {
        return title;
    }

    // гетер автора
    public String getAuthor() {
        return author;
    }

    // сетер названия
    public void setTitle(String title) {
        this.title = title;
    }

    // сетер автора
    public void setAuthor(String author) {
        this.author = author;
    }

    // гетер доступность
    public boolean getAvailable() {
        return available;
    }

    // сетер доступность
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // метод показать информацию
    public void displayInfo() {
        System.out.println("book: " + title + ", " + author +", " + available);
    }

}
