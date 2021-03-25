package prueba;
import java.util.Scanner;
public class e2 {

    public static void imprimir(int[] L, int n){
        if((L[L.length-1] == 0) && (L[0] == 0)){
            System.out.println(" + 0");
        }
        else if ((L.length == 1) && (L[0] == 0)){
            System.out.println(" + 0");
        }
        else if (L[n]>0 && n==0){
            System.out.print(" + " + L[0]);
        }
        else if (L[n]<0 && n==0){
            System.out.print(" - " + Math.abs(L[0]));
        }
        else if (L[n]==0 && n==0){
            return;
        }
        else{
            if (L[n]>0){
                System.out.print(" + " + L[n] + "x^" + n);
                imprimir(L, n-1);
            }
            else if(L[n]<0){
                System.out.print(" - " + Math.abs(L[n]) + "x^" + n);
                imprimir(L, n-1);
            }else {
                imprimir(L, n - 1);
            }
        }
    }

    public static void sPolinomios(int[] A, int[] B, int[] C, int n, int m, int l){
        if(n>m && n!=0){
            C[l] = A[n];
            sPolinomios(A,B,C,n-1,m,l-1);
        }
        else if(n<m && m!=0){
            C[l] = B[m];
            sPolinomios(A,B,C,n,m-1,l-1);
        }
        else if(n==m && l!=0){
            C[l] = A[n] + B[m];
            sPolinomios(A,B,C,n-1,m-1,l-1);
        }
        else{
            C[0] = A[0] + B[0];
            imprimir(C,C.length-1);
        }
    }

    public static void rPolinomios(int[] A, int[] B, int[] C, int n, int m, int l){
        if(n>m && n!=0){
            C[l] = A[n];
            rPolinomios(A,B,C,n-1,m,l-1);
        }
        else if(n<m && m!=0){
            C[l] = - B[m];
            rPolinomios(A,B,C,n,m-1,l-1);
        }
        else if(n==m && l!=0){
            C[l] = -A[n] - -B[m];
            C[l] = C[l] * -1;
            rPolinomios(A,B,C,n-1,m-1,l-1);
        }
        else{
            C[0] = -A[0] - -B[0];
            C[0] = C[0] * -1;
            imprimir(C,C.length-1);
        }
    }

    public static void main(String[] args){

        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int[] A = new int[n+1];
        for(int i = 0; i<=n; i++){
            A[i] = S.nextInt();
        }

        int m = S.nextInt();
        int[] B = new int[m+1];
        for(int i = 0; i<=m; i++){
            B[i] = S.nextInt();
        }

        int mayor;
        if(A.length > B.length){
            mayor = A.length;
        }
        else{
            mayor = B.length;
        }

        int[] C = new int[mayor];
        int[] D = new int[mayor];

        sPolinomios(A,B,C,n,m,mayor-1);
        System.out.println();
        rPolinomios(A,B,D,n,m,mayor-1);
    }
}

