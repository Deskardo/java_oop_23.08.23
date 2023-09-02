package home_work_2.ex_003;

// Вывод на печать меню
interface IMenu {

    default void printMenu() {
        System.out.println("1. Добавить книгу в библиотеку Library");
        System.out.println("2. Удалить книгу из библиотеки");
        System.out.println("3. Показать все доступные книги");
        System.out.println("4. Поиск книг по автору");
        System.out.println("5. Для выхода из программы");
        System.out.println();
        System.out.println("Введите нужный пункт.");
    }

    

}
