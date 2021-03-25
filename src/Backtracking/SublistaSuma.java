package Backtracking;

import java.util.ArrayList;

public class SublistaSuma {
    public static void main(String[] args){
        int s = 13;
        int[] L = {1,2,3,5,6,7,9};
        ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Integer> soldef = new ArrayList<>();
        Sublista(0,s,L,sol,soldef,0);
        System.out.println(soldef);
    }
    public static ArrayList<Integer> CardinalidadMinima (ArrayList<Integer> soldef, ArrayList<Integer> sol, int indice){
        if (indice > 0){
            if (sol.size() < indice){
                soldef = sol;
            }
        }
        return soldef;
    }
    public static void Sublista (int suma, int s, int[] L, ArrayList<Integer> sol, ArrayList<Integer> soldef, int cont){
        if (suma == s){
            cont = sol.size();
            soldef = CardinalidadMinima(soldef,sol,cont);
        }
        else {
            for (int i = 0; i < L.length; i++){
                suma += L[i];
                if (suma <= s) {
                    sol.add(L[i]);
                    Sublista(suma, s, L, sol,soldef,cont);
                    sol.remove((Integer) L[i]);
                }
                suma -= L[i];
            }
        }
    }
}
