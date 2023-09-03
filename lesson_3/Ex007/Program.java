package lesson_3.Ex007;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода2"));
        latte.addComponent(new Water("вода3"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
