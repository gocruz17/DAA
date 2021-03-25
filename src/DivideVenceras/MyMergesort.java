package DivideVenceras;

import java.util.ArrayList;

public class MyMergesort {
    public static void main(String[] args) {
        int[] a = {3, 1, 5, 2, 7};
        Mergesort(0,a.length-1,a);
        Print(a);
    }
    public static void Print (int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" , ");
        }
    }
    public static void Cambio (int[] a, int x, int y){
        int aux = a[x];
        a[x] = a[y];
        a[y] = aux;
    }
    public static boolean Desordenado (int[] a){
        boolean valido = true;
        for (int i = 1; i < a.length; i++){
            if (a[i-1] > a[i])
                valido = false;
        }
        return valido;
    }
    public static int Mergesort (int inicio ,int fin,int[] a){
        if (Desordenado(a)) {
            if (inicio == fin) {
                return a[inicio];
            }
            int mitad = (inicio + fin) / 2;
            int x = Mergesort(inicio, mitad, a);
            int y = Mergesort(mitad + 1, fin, a);
            if (x > y) {
                Cambio(a, x, y);
            }
            Mergesort(inicio,fin,a);
        }
        return 0;
    }
}
