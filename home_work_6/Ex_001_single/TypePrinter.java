package home_work_6.Ex_001_single;

/**
 * Класс позволяющий выводить на печать тип получаемого обобщенного объекта
 */
class TypePrinter { // класс TypePrinter для печати типа получаемого элемента

    /**
     * Метод позволяющий вывести на печать данные по созданному объекту обобщенного типа
     * @param <T> тип присвоенный объекту
     * @param item имя созданного экземпляра класса Container<T>
     */
    public <T> void printType(Container<T> item) {
        System.out.println("Тип элемента: " + item.getItem().getClass().getName());
    }
}