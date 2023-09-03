package home_work_3.ex_003;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private boolean available;

    // базовый конструктор
    // public Book(String title, String author, boolean available) {
    //     this.title = title;
    //     this.author = author;
    //     this.available = available;
    // }

    // расширенный метод добавления книги в список, через ввод данных, закрытие сканера происходит в меню.
    public Book() {
        Scanner scan = new Scanner(System.in);
        String line = "";
        Boolean flag = true;

        while (flag) {
            System.out.println("Введите название книги: ");
            line = scan.nextLine();
            if (!line.equals(null) && line.length() > 0) {
                this.title = line;
                flag = false;
            } else {
                System.out.print("Введено не корректное значение.");
            }
        }

        flag = true;

        while (flag) {
            System.out.println("Введите автора книги: ");
            line = scan.nextLine();
            if (!line.equals(null) && line.length() > 0) {
                this.author = line;
                flag = false;
            } else {
                System.out.print("Введено не корректное значение.");
            }
        }

        flag = true;

        while (flag) {
            System.out.println("Введите показатель доступности книги (true/false): ");
            line = scan.nextLine().toLowerCase().trim();
            if (line.equals("true") || line.equals("false")){
            boolean flag2 = Boolean.parseBoolean(line);
            this.available = flag2;
            flag = false;
            } else {
                System.out.print("Введено не корректное значение.");
            }
        }
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
        System.out.println("book: " + title + ", " + author + ", " + available);
    }

    @Override
    public String toString() {
        return "Book: title " + title + ", author " + author + ", available " + available;
    }

}
