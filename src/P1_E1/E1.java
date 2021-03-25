package P1_E1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        scan.close();
        DecimalFormat f = new DecimalFormat("#0.0000");
        System.out.println(f.format(Raiz(a, a)));
    }

    public static double Raiz(double a, double x) {
        double e = Math.pow(10,-6);
        if (Math.abs((x*x)-a) < e)
            return x;
        else
            x = x - (((x*x)-a) / (2*x));
            return Raiz(a,x);
    }
}