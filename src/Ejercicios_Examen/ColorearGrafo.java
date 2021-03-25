package Ejercicios_Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorearGrafo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[][] A = {{0,1,1,1,1},
                     {1,0,1,0,0},
                     {1,1,0,0,1},
                     {1,0,0,0,0},
                     {1,0,1,0,0}};
        ArrayList<Integer> sol = new ArrayList<>();
        int m = 2;
        Print(Coloreable(A,sol,m,0));
    }
    public static void Print(boolean sol){
        if (sol)
            System.out.println("Coloreable");
        else
            System.out.println("No coloreable");
    }
    public static boolean CandidatoValido(int k, int i, ArrayList<Integer> sol,int[][] A){
        boolean valido = true;
        int j = 0;
        while (j<i && valido){
            if ((A[j][i] == 1) && (sol.get(j) == k));{
                valido = false;
            }
            j++;
        }
        return valido;
    }

    public static boolean Coloreable(int[][] A, ArrayList<Integer> sol, int m, int i){
        int n = A.length;
        if (i==n){
            return true;
        }
        else {
            boolean exito = false;
            int k = 0;
            while ((k<m) && !exito ){
                if (CandidatoValido(k,i,sol,A)){
                    sol.add(i,k);
                    exito = Coloreable(A,sol,m,i+1);
                }
                k = k + 1;
            }
            return exito;
        }
    }

}
