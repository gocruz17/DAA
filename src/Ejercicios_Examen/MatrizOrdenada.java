package Ejercicios_Examen;

public class MatrizOrdenada {
    public static void main(String[] args) {
        int[][] A = {{1,3,6,8,10},{2,4,10,9,10},{4,8,11,14,14},{5,10,12,15,16}};
        Print(Ordenada(A,0,true));
        System.out.println(A.length);
        System.out.println(A[0].length);
    }
    public static void Print(boolean sol){

        if (sol)
            System.out.println("Ordenada");
        else
            System.out.println("Desordenada");
    }
    public static boolean Ordenada(int[][] A, int i, boolean Orden) {
        if (i >= A[0].length && A.length > 1){
            return Orden;
        }
        else {
            //Recorre columnas
            for (int j = 1;j < A.length; j++){
                if (A[j][i] < A[j-1][i]){
                    Orden = false;
                }
                //Revision filas
                if (i > 0) {
                    if (A[j - 1][i] < A[j - 1][i - 1]) {
                        Orden = false;
                    }
                }
            }
            return Ordenada(A,i+1,Orden);
        }
    }
}
