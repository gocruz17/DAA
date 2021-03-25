package prueba;

import java.util.Scanner;

public class My_Quicksort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {5,1,7,6,44,3};
        Quicksort(a,0,1,a.length-1);
        int mitad = a.length/2;
        Quicksort(a, 0, 1, mitad);
        Quicksort(a, mitad, mitad+1, a.length-1);
        for (int value : a) {
            System.out.println(value);
        }
    }
    public static void swatch(int[] a,int izq,int der){
        int aux = a[izq];
        a[izq] = a[der];
        a[der] = aux;
    }
    public static void Quicksort(int[] a, int piv, int izq, int der){
        System.out.println();
        System.out.println(a[piv]+" "+a[izq]+" "+a[der]);
        System.out.println();
        while (izq<der){
            for (int i = der;i > piv; i--) {
                if (a[i] > a[piv])
                    izq = i;
            }
            for (int i = 1; i < der; i++) {
                if (a[i] < a[piv])
                    der = i;
            }
            if (izq<der)
                swatch(a,izq,der);

            for (int value : a) {
                System.out.println(value);
            }
            System.out.println();
            System.out.println(a[piv]+" "+a[izq]+" "+a[der]);
            System.out.println();
        }
        swatch(a, piv, der);
    }
}
