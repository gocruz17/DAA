package Recursividad;

import java.util.ArrayList;

public class IndicePar_Impar {
    public static void main(String[] args){
        int[] a = {3,6,5,7,0,9,2};
        ArrayList<Integer> Par = new ArrayList<>();
        ArrayList<Integer> Impar = new ArrayList<>();
        ParImpar(a,0,Par,Impar);
        System.out.println(Par);
        System.out.println(Impar);
    }
    public static void ParImpar(int[] a,int i, ArrayList<Integer> Par, ArrayList<Integer> Impar ){
        int n = a.length;
        if (i < n) {
            if (i % 2 == 0)
                Par.add(a[i]);
            else
                Impar.add(a[i]);
            ParImpar(a,i+1,Par,Impar);
        }
    }
}
