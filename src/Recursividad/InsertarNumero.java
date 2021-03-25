package Recursividad;

public class InsertarNumero {
    public static void main(String[] args) {
        int a = 245778;
        int x = 1;
        System.out.println(InsertarNumero(a,x));
        System.out.println(a % 10);
    }
    public static int InsertarNumero (int a, int x){
        if (a % 10 <= x){
            return a*10 + x;
        }
        else
            return a % 10 + InsertarNumero(a/10,x)*10 ;
    }
}
