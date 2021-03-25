package Ejercicios_Examen;

import java.util.Scanner;

public class Insercion_numero_ordenado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int x = scan.nextInt();
        System.out.println(Insercion(numero,x));
    }
    public static int Insercion(int num, int x){
        if (x >= num % 10)
            return num*10 + x;
        else
            return (num % 10) + 10*Insercion(num /10, x);
    }
}
