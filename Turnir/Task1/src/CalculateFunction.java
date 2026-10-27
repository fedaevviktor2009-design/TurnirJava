import java.util.stream.LongStream;

public class CalculateFunction {
    private double a, b, x;

    public CalculateFunction(double x) {
        this.x = x;
    }

    public CalculateFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public CalculateFunction(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public double linerFunction(){
        return 3*x+5;
    }

    public double divisionFunction(){
        if (a==b) throw new ArithmeticException("Деление на ноль");
        return (a+b) / (a-b);
    }

    public long factorialFunction(){
        if (a*x/b < 0) throw new ArithmeticException("Факториала от отрицательного существа не существует");
        return LongStream.rangeClosed(2, (int)(a*x/b)).reduce(1, Math::multiplyExact);
    }
}
