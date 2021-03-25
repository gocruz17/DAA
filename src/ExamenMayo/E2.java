package ExamenMayo;

import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        ArrayList<Double> c = new ArrayList<>();
        ArrayList<Double> pares = new ArrayList<>();
        ArrayList<Double> impares = new ArrayList<>();
        //DivideListas(0, c, pares, impares);
        //Polinomio(pares,impares,0,c.size()-1);
    }

    public static double Polinomio(ArrayList<Double> pares, ArrayList<Double> impares, double suma, int n) {
        if (n == 0) {
            if (n % 2 == 0) {
                return suma + pares.get(n);
            } else {
                return suma + impares.get(n);
            }
        }
        if (n % 2 == 0) {
            suma = pares.get(n) + suma;
            return Polinomio(pares, impares, suma, n - 1);
        } else {
            suma = impares.get(n) + suma;
            return Polinomio(pares, impares, suma, n - 1);
        }
    }
}
    //public static void DivideListas(int i, ArrayList<Double> lista, ArrayList<Double> pares, ArrayList<Double> impares){
        //if (i == lista.size()-1){
            //System.out.println();
       // }
       // else{
         //   if (lista.get(i) % 2 == 0){
          //      pares.add(i);
          //  }
           // else {
           //     impares.add(i);
           // }
          //  DivideListas(i+1,lista,pares,impares);
      //  }
  //  }
//}
