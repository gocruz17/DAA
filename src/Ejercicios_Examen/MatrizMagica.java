package Ejercicios_Examen;

public class MatrizMagica {
    public static void main(String[] args) {
        int n = 4;
        int[][] M = {{1,3,6,8},{2,4,10,9},{4,8,11,14},{5,10,12,15}};

    }
    public static int sum(int[] A){
        int aux = 0;
        for (int i = 0; i < A.length; i++){
            aux = aux + A[i];
        }
        return aux;
    }
    public static int Magico(int i, int j, boolean[] libres, int[][] M, int[][] Sol, int[] columnas, int[] filas, int diagonal1, int diagonal2){
        int n = M[0].length;
        int s = n*((n*n)+1)/2;
        if (i == n){
            if((sum(filas) == s) && (sum(columnas) == s) && (diagonal1 == s) && (diagonal2 == s)){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            int cont = 0;
            for (int k = 1; k < n*n+1; k++){
                if (libres[k-1]){
                    Sol[i][j] = k;

                    libres[k-1] = false;
                    filas[i] = filas[i] + k;
                    columnas[j] = columnas[j] + k;

                    if (i == j){
                        diagonal1 = diagonal1 + k;
                    }
                    if (i+j == n-1){
                        diagonal2 = diagonal2 + k;
                    }
                    if ((filas[i] <= s) && (columnas[j] <= s) && (diagonal1 <= s) && (diagonal2 <= s)){
                        int nueva_i;
                        int nueva_j;
                        if (j == n-1){
                            nueva_i = i+1;
                            nueva_j = 0;
                        }
                        else {
                            nueva_i = i;
                            nueva_j = j+1;
                        }
                        cont = cont + Magico(nueva_i, nueva_j, libres, M, Sol, columnas, filas, diagonal1, diagonal2);
                    }
                    filas[i] = filas[i] - k;
                    columnas[j] = columnas[j] - k;
                    if (i == j){
                        diagonal1 = diagonal1 - k;
                    }
                    if (i+j == n-1){
                        diagonal1 = diagonal1 - k;
                    }
                    libres[k-1] = true;
                }
            }
            return cont;
        }
    }
}
