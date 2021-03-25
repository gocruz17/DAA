package P2_E2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamaño1 = scan.nextInt();
        int[] lista1 = new int[tamaño1+1];
        for (int a = 0; a <= tamaño1; a++) {
            lista1[a] = scan.nextInt();
        }
        int tamaño2 = scan.nextInt();
        int[] lista2 = new int[tamaño2+1];
        for (int a = 0; a <= tamaño2; a++) {
            lista2[a] = scan.nextInt();
        }
        int[] suma = new  int[Math.max(lista1.length,lista2.length)];
        int[] resta = new  int[Math.max(lista1.length,lista2.length)];
        suma = Sumar(lista1,lista2,suma,0);
        resta = Restar(lista1,lista2,resta,0);
//******************************SUMA************************************************
        if (suma.length-1 == 0){
            if (suma[0] >= 0)
                System.out.println(" + " +suma[0]);
            else
                System.out.println(" - " +Math.abs(suma[0]));
        }
        else {
            if (suma[suma.length - 1 ] == 0 && suma.length-1 == 0)
                System.out.println(" + 0");
            else
                System.out.println(Mostrar(0, suma.length - 1, suma));
        }
//****************************RESTA**************************************************
        if (resta.length-1 == 0){
            if (resta[0] >= 0)
                System.out.println(" + " +resta[0]);
            else
                System.out.println(" - " +Math.abs(resta[0]));
        }
        else {
            if (resta[resta.length - 1] == 0)
                System.out.println(" + 0");
            else
                System.out.println(Mostrar(0, resta.length - 1, resta));
        }
    }

    public static int[] Sumar(int[] p1, int[] p2,int[] res, int aux){
        if (aux > p1.length-1){
            for (int a = aux; a <= p2.length-1; a++) {
                res[a] = p2[a];
            }
            return res;
        }
        else if (aux > p2.length-1) {
            for (int a = aux; a <= p1.length-1; a++) {
                res[a] = p1[a];
            }
            return res;
        }
        else {
            res[aux] = p1[aux] + p2[aux];
            return Sumar(p1,p2,res,aux+1);
        }
    }
    public static int[] Restar(int[] p1, int[] p2,int[] res, int aux){
        if (aux > p1.length-1){
            for (int a = aux; a<= p2.length-1; a++) {
                res[a] = - p2[a];
            }
            return res;
        }
        else if (aux > p2.length-1) {
            for (int a = aux; a<= p1.length-1; a++) {
                res[a] = p1[a];
            }
            return res;
        }
        else {
            res[aux] = p1[aux] - p2[aux];
            return Restar(p1,p2,res,aux+1);
        }
    }

    public static String Mostrar(int inicio, int fin, int[] list) {
        String s,a,b;
        if (list[inicio] >= 0)
            s = "+";
        else
            s = "-";
        if (inicio == fin)
            if (inicio == 0) {
                if (list[inicio] == 0)
                    return "";
                else
                    return (" " + s + " " + Math.abs(list[inicio]));
            }
            else if (list[inicio] == 0)
                return "";
            else
                return (" "+s+" "+Math.abs(list[inicio])+"x^"+inicio);
        else {
            int mitad = (inicio+fin)/2;
            a = Mostrar(inicio,mitad,list);
            b = Mostrar(mitad+1,fin,list);
            return b.concat(a);
        }
    }
}