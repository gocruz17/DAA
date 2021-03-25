package Ejercicios_Examen;

import java.util.ArrayList;

public class ActividadesBacktracking {
    public static void main(String[] args) {
        int[] A = {-1,-4,5,2,-3,4,2,-5};
    }
    public static boolean EsValido(int i, int[] sol, int[] c, int[] f){
        boolean valido = true;
        int j = 0;
        while ((j<i) && valido){
            if (sol[i] == 1){
                valido = (c[i]>=f[j] || c[j]>=f[i]);
            }
            j++;
        }
        return valido;
    }
    public static int MaxCard(int i, int card_act, int[] sol, int[] sol_opt, int card_opt,int[] c, int[] f){
        int n = sol.length;
        if (i==n) {
            if (card_act>card_opt){
                card_opt = card_act;
                for (int k = 0; k<n; k++){
                    sol_opt[k] = sol[k];
                }
            }
            else {
                for (int k = 0; k <= 1; k++){
                    if ((k == 0) || EsValido(i,sol,c,f)){
                        sol[i] = k;
                        card_act = card_act + k;
                        card_opt = MaxCard(i+1,card_act,sol,sol_opt,card_opt,c,f);
                    }
                }
            }
        }
        return card_opt;
    }
}
