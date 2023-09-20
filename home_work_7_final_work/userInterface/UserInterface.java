package home_work_7_final_work.userInterface;

import java.util.Scanner;

import home_work_7_final_work.operation.ComplexNumber;
import home_work_7_final_work.operationInterface.ComplexNumberInterface;

/**
 * Класс UserInterface, описывающий методы для работы калькулятора
 * ввод данных пользователем и вывод данных полученных в результате проведенных
 * операций
 */
public class UserInterface {
    private Scanner scanner;

    /**
     * базовый конструктор выполняющий запуск сканера
     */
    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    /**
     * Метод, запрашивающий ввод данных от пользователя,
     * создает новый объект класса ComplexNumber с заданными значениями
     * 
     * @return Возвращает объект типа ComplexNumberInterface
     */
    public ComplexNumberInterface getComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imag = scanner.nextDouble();
        return new ComplexNumber(real, imag);
    }

    /**
     * Метод запрашивает у пользователя введение знака операции
     * 
     * @return Возвращает активный сканнер для ввода данных
     */
    public String getOperation() {
        System.out.print("Выберите операцию (+, -, *, /): ");
        return scanner.next();
    }

    /**
     * Метод вывода на печать результата, полученного
     * после работы одного из методов калькулятора.
     */
    public void printResult(ComplexNumberInterface result) {
        System.out.println("Результат: " + result.toString());
    }

    /**
     * Метод вывода на печать ошибок
     */
    public void printError() {
        System.out.println("Ошибка: неверная операция");
    }
}
