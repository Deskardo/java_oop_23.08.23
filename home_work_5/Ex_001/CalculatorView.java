package home_work_5.Ex_001;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    public void displayResult(double result) {
        System.out.println("Результат операции: " + result);
    }

    public void displayErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public String getOperation() {
        System.out.print("Введите оператор для вычисления (+,-,*,/): ");
        return scanner.next();
    }
}
