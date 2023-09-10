package home_work_5.Ex_001;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void calculate() {
        double firstNumber, secondNumber = 0;

        try {
            firstNumber = view.getFirstNumber();
            secondNumber = view.getSecondNumber();

            String operation = view.getOperation();

            switch (operation) {
                case "+":
                    view.displayResult(model.add(firstNumber, secondNumber));
                    break;
                case "-":
                    view.displayResult(model.subtract(firstNumber, secondNumber));
                    break;
                case "*":
                    view.displayResult(model.multiply(firstNumber, secondNumber));
                    break;
                case "/":
                    view.displayResult(model.divide(firstNumber, secondNumber));
                    break;
                default:
                    view.displayErrorMessage("Не корректный ввод.");
            }
        } catch (NumberFormatException ex) {
            view.displayErrorMessage("Необходимо ввести два числа.");
        } catch (IllegalArgumentException ex) {
            view.displayErrorMessage(ex.getMessage());
        }
    }
}