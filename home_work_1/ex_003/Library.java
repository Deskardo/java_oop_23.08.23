package home_work_1.ex_003;

import java.util.*;

class Library {
    private static ArrayList<Book> catalog = new ArrayList<>();

    // базовый конструктор каталога
    public Library(ArrayList<Book> catalog) {
        Library.catalog = catalog;
    }

    public Library() {
        this(catalog);
    }

    // добавление книг в каталог
    public void addBook(Book book) {
        catalog.add(book);
    }

    // удаление книг из каталога
    public void removeBook(Book book) {
        catalog.remove(book);
    }

    // цикл для отображения книг
    public void displayAvailableBooks() {
        System.out.println("На текущий момент доступны: ");
        for (Book book : catalog) {
            if (book.getAvailable()) {
                book.displayInfo();
            }
        }
    }

    // поиск книги по автору
    public void searchByAuthor(String author) {
        System.out.println("По автору " + author + " есть следующие книги: ");
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }
}
