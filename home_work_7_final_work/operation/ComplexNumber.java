package home_work_7_final_work.operation;

import home_work_7_final_work.operationInterface.ComplexNumberInterface;

/**
 * Класс ComplexNumber имплементирующий интерфейс ComplexNumberInterface
 * и четко описывающий методы используемые в калькуляторе
 */
public class ComplexNumber implements ComplexNumberInterface {
    private double real;
    private double imag;

    /**
     * Базовый конструктор класса
     * 
     * @param real Вещественное число
     * @param imag Мнимое число
     */
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Метод описывающий сумму текущего комплексного объекта
     * и переданного комплексного объекта
     * 
     * @return возвращает новый объект, который представляет собой
     *         сумму двух комплексных чисел
     */
    @Override
    public ComplexNumberInterface add(ComplexNumberInterface other) {
        double real = this.real + ((ComplexNumber) other).real;
        double imag = this.imag + ((ComplexNumber) other).imag;
        return new ComplexNumber(real, imag);
    }

    /**
     * Метод описывающий разность текущего комплексного объекта
     * и переданного комплексного объекта
     * 
     * @return возвращает новый объект, который представляет собой
     *         разность двух комплексных чисел
     */
    @Override
    public ComplexNumberInterface subtract(ComplexNumberInterface other) {
        double real = this.real - ((ComplexNumber) other).real;
        double imag = this.imag - ((ComplexNumber) other).imag;
        return new ComplexNumber(real, imag);
    }

    /**
     * Метод описывающий умножение текущего комплексного объекта
     * и переданного комплексного объекта
     * 
     * @return возвращает новый объект, который представляет собой
     *         произведение двух комплексных чисел
     */
    @Override
    public ComplexNumberInterface multiply(ComplexNumberInterface other) {
        double real = this.real * ((ComplexNumber) other).real - this.imag * ((ComplexNumber) other).imag;
        double imag = this.real * ((ComplexNumber) other).imag + this.imag * ((ComplexNumber) other).real;
        return new ComplexNumber(real, imag);
    }

    /**
     * Метод описывающий деление текущего комплексного объекта
     * и переданного комплексного объекта
     * 
     * @return возвращает новый объект, который представляет собой
     *         частное двух комплексных чисел
     */
    @Override
    public ComplexNumberInterface divide(ComplexNumberInterface other) {
        double denominator = ((ComplexNumber) other).real * ((ComplexNumber) other).real
                + ((ComplexNumber) other).imag * ((ComplexNumber) other).imag;
        double real = (this.real * ((ComplexNumber) other).real + this.imag * ((ComplexNumber) other).imag)
                / denominator;
        double imag = (this.imag * ((ComplexNumber) other).real - this.real * ((ComplexNumber) other).imag)
                / denominator;
        return new ComplexNumber(real, imag);
    }

    /**
     * Переопределенный метод toString, для вывода результата
     * выбранной операции над комплексными числами
     * 
     * @return Возвращает строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        if (imag >= 0) {
            return String.format("%.2f+%.2fi", real, imag);
        } else {
            return String.format("%.2f%.2fi", real, imag);
        }
    }
}
