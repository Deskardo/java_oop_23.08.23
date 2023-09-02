package seminar_2.ex_002;

public class App {
    public static void main(String[] args) {
        // Использование объявленных переменных
        System.out.println("Array size: " + Constants.ARRAY_SIZE);
        System.out.println("Max value: " + Constants.MAX_VALUE);

        // Создание и заполнение массива
        int[] numbers = new int[Constants.ARRAY_SIZE];
        for (int i = 0; i < Constants.ARRAY_SIZE; i++) {
            numbers[i] = i * Constants.MAX_VALUE;
        }

        // вывод содержимого массива
        System.out.println("Array contents;");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
    }
}
