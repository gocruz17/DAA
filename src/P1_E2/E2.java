package P1_E2;

import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        if (tamaño >= 1) {
            ArrayList<Integer> array = new ArrayList<>();
            ArrayList<Integer> arrayRes = new ArrayList<>();
            for (int a = 0; a <= tamaño - 1; a++) {
                array.add(scan.nextInt());
            }
            int numero = scan.nextInt();
            scan.close();
            arrayRes = Recorrer(array, numero, 0);
            for (int a = 0; a <= arrayRes.size() - 1; a++) {
                System.out.println(arrayRes.get(a));
            }
        }
    }
    public static ArrayList<Integer> Recorrer(ArrayList<Integer> lista, int num, int i) {
        if (num < lista.get(i)) {
            lista.add(i, num);
            return lista;
        }
        else
            if (i==lista.size()-1) {
                lista.add(num);
                return lista;
            }
            else
                return Recorrer(lista, num, i + 1);

    }
}
