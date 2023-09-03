package home_work_3.ex_003;

import java.util.*;

class Library implements IMenu, Icase {
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

    // реализую метод добавления книги в список, через меню.
    @Override
    public void case1() {
        Scanner scan = new Scanner(System.in);
        String Line = "";
        do {
            System.out.println("Желаете добавить книгу? (y/n)");
            Line = scan.nextLine().toLowerCase();
            if (!Line.equals(null) && "y".equals(Line)) {
                Book book = new Book();
                catalog.add(book);
            } else if ("n".equals(Line)) {
                System.out.println("Спасибо, до встречи!");
            } else {
                System.out.println("Вы ввели неверные данные, попробуйте ещё.");
            }

        } while (!"n".equals(Line));

    }

    // метод удаления книги из каталога, путем указания индекса данной книги
    @Override
    public void case2() {
        Scanner scan = new Scanner(System.in);
        String Line = "";
        int i;
        if (catalog.size() > 0) {
            do {

                System.out.println("Желаете удалить книгу? (y/n)");
                Line = scan.nextLine().toLowerCase();
                if (!Line.equals(null) && "y".equals(Line)) {
                    System.out.println("Введите номер книги для удаления: ");
                    Line = scan.nextLine();
                    try {
                        i = Integer.parseInt(Line);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод");
                    }
                    i = Integer.parseInt(Line);
                    if (i < catalog.size()) {
                        System.out.println("Книга №" + i + " " + catalog.get(i) + " Успешно удалена");
                        catalog.remove(i);
                    } else {
                        System.out.println("В каталоге нет книги с таким номером");
                    }

                } else if ("n".equals(Line)) {
                    System.out.println("Спасибо, до встречи!");
                } else {
                    System.out.println("Вы ввели неверные данные, попробуйте ещё.");
                }

            } while (!"n".equals(Line));
        } else {
            System.out.println("В каталоге недостаточно книг для удаления.");
        }
    }

    // вывод доступных книг в каталоге (i отражет номер доступной книги во всем
    // каталоге)
    @Override
    public void case3() {
        int i = 0;
        if (catalog.size() > 0) {
            System.out.println("На текущий момент доступны: ");
            for (Book book : catalog) {
                i++;
                if (book.getAvailable()) {
                    System.out.print("№" + i + ". ");
                    book.displayInfo();
                }
            }
            System.out.println();
        } else {
            System.out.println("В каталоге недостаточно книг");
        }
    }

    // поиск книг по автору
    @Override
    public void case4() {
        Scanner scan = new Scanner(System.in);
        String Line = "";
        int i = 0;
        if (catalog.size() > 0) {
            System.out.println("введите автора для поиска: ");
            Line = scan.nextLine().toLowerCase();
            if (!Line.equals(null)) {
                System.out.println("В каталоге есть следующие книги: ");
                for (Book book : catalog) {
                    i++;
                    if (book.getAuthor().equals(Line)) {
                        System.out.print("№" + i + ". ");
                        book.displayInfo();
                    }
                }
            } else {
                System.out.println("Вы ввели неверные данные, попробуйте ещё.");
            }
        } else {
            System.out.println("В каталоге недостаточно книг");
        }
    }

    // основное меню работы с каталогом
    public void start() {
        Scanner scan = new Scanner(System.in);
        String readLine = "";
        Integer key = 0;
        do {
            printMenu();
            readLine = scan.nextLine();

            try {
                key = Integer.parseInt(readLine);
            } catch (NumberFormatException e) {
                System.out.println("Не корректный ввод, попробуйте ещё раз.");
            }

            switch (key) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 5:
                    System.out.println("Спасибо, за работу, возвращайтесь ещё!");
                    break;
                default:
                    System.out.println("Не корректный ввод.");

            }

        } while (key != 5);
        scan.close();
    }

}
