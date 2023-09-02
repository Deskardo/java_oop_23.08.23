package home_work_2.ex_003;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    private void printMenu() {
        System.out.println("1. Добавить книгу в библиотеку Library");
        System.out.println("2. Удалить книгу из библиотеки");
        System.out.println("3. Показать все доступные книги");
        System.out.println("4. Поиск книг по автору");
        System.out.println("5. Для выхода из программы");
        System.out.println();
        System.out.println("Введите нужный пункт.");
    }

    public void start() {
        if(this.scanner != null) {
            int key = 0;
            do{
                printMenu();
                key = this.scanner.nextInt();
            }while(key != 5);
        }
    }

}
