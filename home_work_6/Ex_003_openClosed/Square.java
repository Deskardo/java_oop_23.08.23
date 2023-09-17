package home_work_6.Ex_003_openClosed;

/**
 * Класс Square Имплеменитрует интерфейс Operation и рассчитывает квадрат принимаемого числа
 */
class Square implements Operation {

    /** Метод вычисляет квадрат числа принимаемого в качестве аргумента
     * приводит его к типу double и возвращает значение с типом double
     * @param number число принимаемое в качестве аргумента
     * @return квадрат числа number
     */
    @Override
    public <T extends Number> double apply(NumberContainer<T> number){
        return number.getNumber().doubleValue() * number.getNumber().doubleValue();
    }
}
// мы можем менять метод, раширять функционал, при этом не ломая основной логики работы приложения.

