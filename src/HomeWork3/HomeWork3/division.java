package HomeWork3;

public class division implements calculate{
    @Override
    public double calculate(double x, char operate, double y) {
        if(y==0)
            System.out.println("Please Input Again!!");
        else
        System.out.println(x/y);
        return x/y;
    }
}
