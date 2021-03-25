package Ejercicios_Examen;

public class SublistaSumaMaxima {
    public static void main(String[] args) {
        int[] A = {-1,-4,5,2,-3,4,2,-5};
        //Print(SumaSublista();
        System.out.println(SumaSublista(A,0,A.length-1));
    }
    public static int max(int a, int b) {
        if (a>b)
            return a;
        else
            return b;
        }
    public static int SumaSublista(int[] A, int ini, int fin){
        int n = A.length;
        if (ini == fin){
            return A[ini];
        }
        else {
            int mitad = (ini + fin)/2;
            int izq = SumaSublista(A, ini, mitad);
            int dcha = SumaSublista(A,mitad+1, fin);
            int max_izq = -Integer.MAX_VALUE;
            int aux_suma = 0;
            for (int i=mitad; i>=0; i--) {
                aux_suma = aux_suma + A[i];
                max_izq = max(max_izq,aux_suma);
            }
            // suma máxima de las listas de la mitad derecha
            // que contienen el índice (mitad)
            int max_dcha = -Integer.MAX_VALUE;
            aux_suma = 0;
            for (int i=mitad+1; i<n; i++) {
                aux_suma = aux_suma + A[i];
                 max_dcha = max(max_dcha,aux_suma);
             }

            return max(max(izq, dcha), max_izq+max_dcha);
        }
    }
}
