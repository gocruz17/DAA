package DivideVenceras;

import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args){
        int[] a = {4,1,7,23,7,1,6,1,9,7};
        System.out.println("Minimo: " + MIN(0,a.length-1,a));
        System.out.println("Maximo: " + MAX(0,a.length-1,a));
    }
    public static int MIN(int inicio, int fin, int[] a){
        if (inicio == fin){
            return a[inicio];
        }
        int mitad = (inicio + fin) / 2;
        int x = MIN(inicio,mitad,a);
        int y = MIN(mitad+1,fin,a);
        if (x < y)
            return x;
        else
            return y;
    }
    public static int MAX(int inicio, int fin, int[] a){
        if (inicio == fin){
            return a[inicio];
        }
        int mitad = (inicio + fin) / 2;
        int x = MAX(inicio,mitad,a);
        int y = MAX(mitad+1,fin,a);
        if (x > y)
            return x;
        else
            return y;
    }
    public static ArrayList<Integer> MinMax(int inicio, int fin, int[] a){
        ArrayList<Integer> s = new ArrayList<>();
        if (inicio == fin){
            return s;
        }
        int mitad = (inicio + fin) / 2;
        int x = MinMax(inicio,mitad,a).get(0);
        int y = MinMax(mitad+1,fin,a).get(1);

        if (x > y)
            s.add(x);
        else
            s.add(y);
        return s;
    }
}
