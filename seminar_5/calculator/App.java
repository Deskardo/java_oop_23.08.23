package seminar_5.calculator;

public class App {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        double num1 = 10;
        double num2 = 5;
        char operator = '/';

        controller.calculate(num1, num2, operator);
    }
}
