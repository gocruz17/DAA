package Backtracking;

import java.util.ArrayList;

public class MutacionesRepeticion {
    public static void main(String[] args){
        ArrayList<String> s = new ArrayList<>();
        String[] a = {"a","b","c"};
        int[] r = {1,2,1};
        Permutar(0,a,r,s);
    }

    public static int SumaR (int[] r){
        int i = 0;
        for (int a : r)
            i += a;
        return i;
    }
    public static void Permutar(int i, String[] a, int[] r, ArrayList<String> s){
        if (i == SumaR(r)){
            System.out.println(s);
        }
        else if (i < SumaR(r)){
            if (r[i] > 0) {
                for (int j = 1; j <= r[i]; j++) {
                    s.add(a[i]);
                    System.out.println(s);
                    r[i] -= 1;
                    Permutar(i + 1, a, r, s);
                    r[i] += 1;
                    s.remove(a[i]);
                }
            }
        }
    }
}
