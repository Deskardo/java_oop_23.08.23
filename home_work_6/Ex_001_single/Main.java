package home_work_6.Ex_001_single;

class Main {
    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>(42);
        Container<String> stringContainer = new Container<>("Привет мир");

        TypePrinter printer = new TypePrinter();
        printer.printType(intContainer);
        printer.printType(stringContainer);
    }
}
