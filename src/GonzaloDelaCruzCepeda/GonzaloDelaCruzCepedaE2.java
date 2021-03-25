package GonzaloDelaCruzCepeda;

import java.util.ArrayList;

public class GonzaloDelaCruzCepedaE2 {
    public static void main(String[] args){
        ArrayList<Integer> s = new ArrayList<>();
        int n = 7;
        int m = 3;
        CombinacionSinRepeticion(n,m,s,0);
    }
    public static boolean CandidatoValido(ArrayList<Integer> s, int a, int m){
        if (s.size() > 0){
            if (a - s.get(s.size()-1) < m-1)
                return false;
        }
        for (int i = 0; i < s.size();i++){
            if (a == s.get(i))
                return false;
        }
        return true;
    }
    public static void CombinacionSinRepeticion(int n, int m, ArrayList<Integer> s, int a){
        if (a >= m) {
            System.out.println(s);
        }
        else {
            for (int i = 1; i <= n; i++){
                if (CandidatoValido(s,i,m)) {
                    s.add(i);
                    CombinacionSinRepeticion(n, m, s, a+1);
                    s.remove((Integer) i);
                }
            }
        }
    }
}
