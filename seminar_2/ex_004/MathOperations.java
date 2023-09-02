package seminar_2.ex_004;

// интерфейс для математических операций
interface MathOperations {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }

}
