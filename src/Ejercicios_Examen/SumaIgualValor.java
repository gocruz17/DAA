package Ejercicios_Examen;

import java.util.Arrays;
import java.util.Scanner;

public class SumaIgualValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = 13;
        int[] L = {1,2,3,5,6,7,9};
        System.out.println();
        boolean[] sol_parcial = new  boolean[L.length];
        boolean[] sol_opt = new  boolean[L.length];
        int card_opt = BuscaSub(0,0,L,s,sol_parcial,sol_opt,L.length+1,0);
        System.out.println(card_opt);
        System.out.println(Arrays.toString(sol_opt));

    }

    public static int BuscaSub(int i, int suma_parcial, int[] L, int s, boolean[] sol_parcial, boolean[] sol_opt, int card_opt, int card){

        //genera candidatos (esquema para búsqueda de SUBCONJUNTOS)
        for (int k = 0; k<2;k++){

            int nueva_suma_parcial = suma_parcial + k*L[i];

            //Comprueba si se puede podar el árbol de recursión
            if (nueva_suma_parcial <= s){
                sol_parcial[i] = (k == 1);

                //Actualiza solución parcial
                if (k == 1) {
                    card++;
                }
                //Comprueba si se ha alcanzado el valor en s
                if (nueva_suma_parcial == s){

                    //Actualiza solución y valor óptimos si menor cardinalidad
                    if (card < card_opt){
                        card_opt = card;
                        for (int j = 0; j < L.length;j++){
                            sol_opt[j] = sol_parcial[j];
                        }
                    }
                }
                else if (i<L.length-1 && card<card_opt-1){
                    card_opt = BuscaSub(i+1,nueva_suma_parcial,L,s,sol_parcial,sol_opt,card_opt,card);
                }
            }
        }
        sol_parcial[i] = false;
        return card_opt;
    }

}
