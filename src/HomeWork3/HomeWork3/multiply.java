package HomeWork3;

public class multiply implements calculate{
    @Override
    public double calculate(double x, char operate, double y) {
        System.out.println(x*y);
        return x*y;
    }
}
