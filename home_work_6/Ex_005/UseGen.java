package home_work_6.Ex_005;

public class UseGen {
    static void test(Gen<? extends A> o){ // ? extends A является ограничителем в программе, мы не можем использовать тип отличный от наследников А
        // class body                   // Если вместо extends использовать super то можно использовать только этот класс и его родителей.
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // D d = new D();

        Gen<A> genA = new Gen<A>(a);
        Gen<B> genB = new Gen<B>(b);
        Gen<C> genC = new Gen<C>(c);
        // Gen<D> genD = new Gen<D>(d);

        test(genA);
        test(genB);
        test(genC);
        // test(genD); // из-за ограничения в методе test выходит ошибка, потому что D не является наследником A
    }
}
