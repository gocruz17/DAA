package Ejercicios_Examen;

import java.util.Scanner;

public class IndiceIgualValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {5,3,7,6,44,3};
        System.out.println(Comprobar(a,0,a.length-1));
    }
    public static int Comprobar(int[] a,int inf, int sup){
        int mitad = (inf+sup)/2;
        if (mitad == a[mitad]){
            return mitad;
        }
        if (inf >= sup){
            return -1;
        }
        else if(mitad < a[mitad]){
            return Comprobar(a,inf,mitad);
        }
        else {
            return Comprobar(a,mitad+1,sup);
        }
    }
}
