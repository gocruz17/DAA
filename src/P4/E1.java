package P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        int[] c = new int[tamaño];
        int[] f = new int[tamaño];
        ArrayList<Integer> s = new ArrayList<>();
        if (tamaño > 0 && tamaño <= 500) {
            for (int i = 0; i < tamaño; i++) {
                c[i] = scan.nextInt();
            }
            for (int i = 0; i < tamaño; i++) {
                f[i] = scan.nextInt();
            }
            Ordenacion(c,f);
            Selector(c,f,s);
            System.out.println(s.size());
        }
    }
    public static void Ordenacion(int[] c, int[] f){
        int n = f.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (f[j] > f[j+1])
                {
                    int tempf = f[j];
                    int tempc = c[j];
                    f[j] = f[j+1];
                    c[j] = c[j+1];
                    f[j+1] = tempf;
                    c[j+1] = tempc;
                }
    }

    public static void Selector(int[] c, int[] f, ArrayList<Integer> s){
        s.add(0);
        int k=0;
        for (int i=1;i < c.length;i++){
            if (c[i] >= f[k]){
                s.add(i);
                k = i;
            }
        }
    }
}