package HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x,y;
        String t;
        add a=new add();
        subtraction s=new subtraction();
        multiply m=new multiply();
        division d=new division();
        Scanner sc=new Scanner(System.in);
        x=sc.nextDouble();
        t=sc.next();
        y=sc.nextDouble();
        if("+".equals(t))
            a.calculate(x,'+',y);
        else if("-".equals(t))
        s.calculate(x,'-',y);
        else if("*".equals(t))
        m.calculate(x,'*',y);
        else if("/".equals(t))
        d.calculate(x,'/',y);
        else
            System.out.println("Please re-enter!");
        //System.out.println(t);
    }
}

