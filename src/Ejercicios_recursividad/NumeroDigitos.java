package Ejercicios_recursividad;

import java.util.Scanner;

public class NumeroDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(NumDig(n,1));
    }
    public static int NumDig (int n, int aux){
        if (n<10) {
            return aux;
        }
        else{
            return NumDig(n/10,aux+1);
        }
    }
}
