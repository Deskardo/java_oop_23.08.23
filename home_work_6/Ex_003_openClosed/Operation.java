package home_work_6.Ex_003_openClosed;

/**
 * Интерфейс Operation заключает контракт с классами, которыми он будет имплементирован
 */
interface Operation {
    <T extends Number> double apply(NumberContainer<T> a);
}
// Этот интерфейс позволяет жестко связать классы, которые будут подключать этот интерфейс
// с количеством указанных переменных и используемыми методами.