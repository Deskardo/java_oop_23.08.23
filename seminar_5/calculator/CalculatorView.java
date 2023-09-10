package seminar_5.calculator;

// логика реализации методов.
public class CalculatorView {
    public void printResult(double result){
        System.out.println("Результат: " + result);
    }

    public void printError(String errorMessage){
        System.out.println("Ошибка: " + errorMessage);
    }
}