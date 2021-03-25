package DivideVenceras;

import Recursividad.IndicePar_Impar;

import java.util.ArrayList;

public class PolinomioParImpar extends IndicePar_Impar{
    public static void main(String[] args){
        int[] P = {};
        ArrayList<Integer> Par = new ArrayList<>();
        ArrayList<Integer> Impar = new ArrayList<>();
        ParImpar(P,0,Par,Impar);
        System.out.println(Polinomio(Par,Impar,0,P.length,0));

    }
    public static void ParImpar(int[] a, int i, ArrayList<Integer> Par, ArrayList<Integer> Impar ){
        int n = a.length;
        if (i < n) {
            if (i % 2 == 0)
                Par.add(a[i]);
            else
                Impar.add(a[i]);
            ParImpar(a,i+1,Par,Impar);
        }
    }
    public static int Polinomio(ArrayList<Integer> Par, ArrayList<Integer> Impar, int inicio, int fin, int sol){
        if (inicio == fin){
            return sol;
        }
        //Polinomio()
        return sol;
    }
}
