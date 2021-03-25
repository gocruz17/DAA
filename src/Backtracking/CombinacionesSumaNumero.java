package Backtracking;

import java.util.ArrayList;

public class CombinacionesSumaNumero {
    public static void main(String[] args){
        ArrayList<Integer> s = new ArrayList<>();
        Combinacion(4,0,s);
    }
    public static void Combinacion(int n, int suma, ArrayList<Integer> s) {
        if (suma == n) {
            System.out.println(s);
        }
        else {
            for (int i = 1; i <= n; i++){
                suma += i;
                if (suma <= n) {
                    s.add(i);
                    Combinacion(n, suma, s);
                    s.remove((Integer) i);
                }
                suma -= i;
            }
        }
    }
}
