package home_work_7_final_work.operationInterface;

/**
 * Интерфейс, прописывающий обязательство по основному функционалу калькулятора
 * Калькулятор включает в себя четыре метода:
 * сумма, разность, произведение и деление комплексных чисел.
 */
public interface ComplexNumberInterface {
    ComplexNumberInterface add(ComplexNumberInterface other);

    ComplexNumberInterface subtract(ComplexNumberInterface other);

    ComplexNumberInterface multiply(ComplexNumberInterface other);

    ComplexNumberInterface divide(ComplexNumberInterface other);

    String toString();
}
