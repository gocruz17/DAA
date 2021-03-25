package Backtracking;

public class N_Reinas {
    final static int n = 4;
    public static void main(String[] args) {
        int[][] tablero = new int[n][n];
        Colocar(0,0,tablero);

    }
    public static void Print (int[][] tablero){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean CandidatoValido (int fila, int colum, int[][] tablero){
        int i,j;
        for (i = 0; i < colum; i++)
            if (tablero[fila][i] == 1)
                return false;
        for (i = fila, j = colum; i >= 0 && j >= 0; i--, j--)
            if (tablero[i][j] == 1)
                return false;

        for (i = fila, j = colum; j >= 0 && i < n; i++, j--)
            if (tablero[i][j] == 1)
                return false;
        return true;
    }

//    public static boolean EsSolucion(int[][] tablero){
//        int cont = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (tablero[i][j] == 1 && CandidatoValido(i, j, tablero)) {
//                    cont += 1;
//                }
//            }
//        }
//        if (cont == 4)
//            return true;
//        else
//            return false;
//    }
    public static void Colocar (int fila, int colum, int[][] tablero) {
        if (colum < n){
            for (fila = 0; fila < n; fila++) {
                if (CandidatoValido(fila, colum, tablero)) {
                    tablero[fila][colum] = 1;
                    Colocar(fila,colum+1,tablero);
                    tablero[fila][colum] = 0;
                }
            }
        }
        else {
//            if (EsSolucion(tablero)){
            Print(tablero);
        }
    }
}
