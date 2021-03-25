package P3;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] C = new int[n];
        if (n >= 1) {
            for (int i = 0; i < n; i++) {
                C[i] = scan.nextInt();
            }
            int m = scan.nextInt();
            ArrayList<Integer> rep = new ArrayList<>();
            Subcolecciones(C,0,0,m,rep);
        }
        else
            System.out.println("error");

    }

    public static void Subcolecciones (int[] c, int inum, int contador, int m, ArrayList<Integer> rep){
            if (m == 1)
                System.out.println(c.length);
            else {
                int aux = 1;
                if (inum >= c.length) {
                    System.out.println(contador);
                } else {
                    for (int i = 0; i < c.length; i++) {
                        if (i != inum) {
                            if (c[i] % c[inum] == 0 && c[i] >= c[inum]) {
                                aux++;
                                if (aux == m) {
                                    contador++;
                                    aux = 1;

                                    if (c[i] == c[inum]){
                                        for (int a : rep) {
                                            if (c[inum] == a)
                                                if (contador > 0)
                                                    contador--;
                                        }
                                        rep.add(c[inum]);
                                    }
                                }
                            }
                        }
                    }
                    Subcolecciones(c, inum + 1, contador, m, rep);
                }
            }

    }
}
