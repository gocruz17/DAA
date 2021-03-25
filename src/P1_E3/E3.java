package P1_E3;

import java.util.ArrayList;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        if (tamaño >= 1) {
            ArrayList<Integer> array = new ArrayList<>();
            ArrayList<Integer> arrayRes = new ArrayList<>();
            for (int a = 0; a <= tamaño - 1; a++) {
                array.add(scan.nextInt());
            }
            scan.close();
            arrayRes = Ordenar(array,0);
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
    public static ArrayList<Integer> Ordenar(ArrayList<Integer> lista,int i) {
        if (i < lista.size()-1) {
            if (lista.get(i) <= lista.get(i + 1)) {
                return Ordenar(lista, i + 1);
            } else {
                Recorrer(lista,lista.get(i),i);
                lista.remove(i);
                return Ordenar(lista, 0);
            }
        }
        else
            return lista;

    }
}
