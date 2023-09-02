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

    private void printMenu() {
        System.out.println("1. Добавить книгу в библиотеку Library");
        System.out.println("2. Удалить книгу из библиотеки");
        System.out.println("3. Показать все доступные книги");
        System.out.println("4. Поиск книг по автору");
        System.out.println("5. Для выхода из программы");
        System.out.println();
        System.out.println("Введите нужный пункт.");
    }

    // public void start(Book book) {
    //     Scanner scan = new Scanner(System.in);
    //     String readLine = "";
    //         Integer key = 0;
    //         do{
    //             printMenu();
    //             readLine = scan.nextLine();

    //             try{
    //                 key = Integer.parseInt(readLine);
    //             } catch (NumberFormatException e) {
    //                 System.out.println("Не корректный ввод, попробуйте ещё раз.");
    //             }

    //             switch (key) {
    //                 case 1:
    //                     addBook(book);
    //                     break;
    //                 case 2:
    //                     removeBook(book);
    //                     break;
    //                 case 3:
    //                     displayAvailableBooks();
    //                     break;
    //                 case 4:
    //                     searchByAuthor(readLine);
    //                     break;
    //                 case 5:
    //                     System.out.println("Спасибо, за работу, возвращайтесь ещё!");
    //                     break;
    //                 default:
    //                     System.out.println("Не корректный ввод.");

    //             }

    //         }while(key != 5);
    //         scan.close();
    //     }


}
