package P2_E3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        if (tamaño >= 0 && tamaño <= 100) {
            int[] lista = new int[tamaño+1];
            for (int a = 0; a <= tamaño; a++) {
                lista[a] = scan.nextInt();
            }
            if (tamaño == 0){
                if (lista[0] >= 0)
                    System.out.println(" + " +lista[0]);
                else
                    System.out.println(" - " +Math.abs(lista[0]));

            }
            else if (lista[tamaño] != 0)
                System.out.println(Mostrar(0, tamaño, lista));
        }
    }
    public static String Mostrar(int inicio, int fin, int[] list) {
        String s,a,b;
        if (list[inicio] >= 0)
            s = "+";
        else
            s = "-";
        if (inicio == fin) {
            if (inicio == 0)
                if (list[inicio] == 0)
                    return "";
                else
                    return (" " + s + " " + Math.abs(list[inicio]));
            if (list[inicio] == 0)
                return "";
            else
                return (" " + s + " " + Math.abs(list[inicio]) + "x^" + inicio);
        }
        else {
            int mitad = (inicio+fin)/2;
            a = Mostrar(inicio,mitad,list);
            b = Mostrar(mitad+1,fin,list);
            return b.concat(a);
        }
    }
    /*public static String Multiplicar(int inicio, int fin, int[] list) {
        if (inicio == fin) {

        }
        else {
            int mitad = (inicio+fin)/2;
            Multiplicar(inicio,mitad,list);
            Multiplicar(mitad+1,fin,list);

        }
    }*/
}