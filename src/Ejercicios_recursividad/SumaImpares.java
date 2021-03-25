package Ejercicios_recursividad;

import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(SumaImpar(n));
    }
    public static int SumaImpar(int n){
        if (n<2){
            return 1;
        }
        else
            return SumaImpar(n-1) + ((2*n) - 1);
    }
}
