package Ex_001;

public class Sum<T extends Number> {
    private T num1;
    private T num2;

    public Sum() {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer sumNum(T num1, T num2){
        return num1.intValue() + num2.intValue();
    }
}
