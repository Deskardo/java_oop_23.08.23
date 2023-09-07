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
            try {
                System.out.println("Желаете добавить книгу? (y/n)");
                Line = scan.nextLine().toLowerCase();
                if ("y".equals(Line)) {
                    Book book = new Book();
                    catalog.add(book);
                } else if ("n".equals(Line)) {
                    System.out.println("Спасибо, до встречи!");
                } else {
                    System.out.println("Вы ввели неверные данные, попробуйте ещё.");
                }
            } catch (NullPointerException e) {
                System.out.println("Произошла ошибка. Пожалуйста, попробуйте еще раз.");
                scan.nextLine(); // очистить буфер ввода
            }

        } while (!"n".equals(Line));
        scan.close();
    }

    // метод удаления книги из каталога, путем указания индекса данной книги
    @Override
    public void case2() {
        Scanner scan = new Scanner(System.in);
        String line = "";
        int i;
        if (catalog.size() > 0) {
            do {
                System.out.println("Желаете удалить книгу? (y/n)");
                line = scan.nextLine().toLowerCase();
                if ("y".equals(line)) {
                    while (true) {
                        try {
                            System.out.println("Введите номер книги для удаления: ");
                            i = scan.nextInt();
                            if (i < 1 || i > catalog.size()) {
                                throw new IllegalArgumentException();
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Введите пожалуйста число. ");
                            scan.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Число должно быть от 1 до " + catalog.size() + ".");
                            scan.nextLine();
                        }
                    }
                    Book bookToRemove = catalog.remove(i - 1);
                    System.out.println("Книга \"" + bookToRemove.getTitle() + "\" автора " + bookToRemove.getAuthor()
                            + " удалена из каталога.");
                    if (catalog.size() < 1) {
                        System.out.println("Каталог пуст.");
                        break;
                    }
                } else if ("n".equals(line)) {
                    System.out.println("Спасибо, до встречи!");
                } else {
                    System.out.println("Вы ввели неверные данные, попробуйте ещё.");
                }
            } while (!"n".equals(line));
        } else {
            System.out.println("Каталог пуст.");
        }
        scan.close();
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
        String line = "";
        int i = 0;
        if (catalog.size() > 0) {
            do {
                System.out.println("Введите автора для поиска: ");
                line = scan.nextLine().trim(); // удаляем лишние пробелы
                if (!line.isEmpty()) { // проверяем на пустую строку
                    System.out.println("В каталоге есть следующие книги: ");
                    for (Book book : catalog) {
                        i++;
                        if (book.getAuthor().equalsIgnoreCase(line)) { // используем ignoreCase для игнорирования
                                                                       // регистра
                            System.out.print("№" + i + ". ");
                            book.displayInfo();
                        }
                    }
                    if (i == 0) {
                        System.out.println("Книг данного автора в каталоге нет.");
                    }
                } else {
                    System.out.println("Вы не ввели автора, попробуйте ещё.");
                }
            } while (line.isEmpty());
        } else {
            System.out.println("В каталоге недостаточно книг.");
        }
        scan.close();
    }

    // основное меню работы с каталогом
    public void start() {
        Integer key = 0;
        Scanner scan2 = new Scanner(System.in);
        do {
            String readLine = "";
            printMenu();
            if (scan2.hasNextLine()) {
                readLine = scan2.nextLine();
            } else {
                break;
            }

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
        scan2.close();
    }
}
