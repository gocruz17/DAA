package Recursividad;

public class SumaImpares {
    public static void main(String[] args){
        int n = 4;
        System.out.println(Suma(n));
    }
    public static int Suma(int  n){
        if (n < 2) {
            return 1;
        }
        else {
            return Suma((n-1))+((2*n)-1);
        }
    }

}
