package calculator;

public class Calculator {

    public <T extends Number> double add(T a, T b) {
        if(a == null || b == null)
            throw new IllegalArgumentException("Arguments cannot be null");
        double res = a.doubleValue()+b.doubleValue();
        if(Double.isInfinite(res))
            throw new ArithmeticException("Double overflow occurred");
        return a.doubleValue()+b.doubleValue();
    }
}
