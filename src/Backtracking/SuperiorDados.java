package Backtracking;

public class SuperiorDados {
    public static void main(String[] args){
        int[] s = {1,1,1};
        Dados(15,0,1,s);
    }
    public static void Dados(int n, int suma, int a, int[] s){
        if (suma >= n && a >= 3) {
            print(s, n);
        }
        else if (a <= 3){
           for (int i = 1; i <= 6; i++){
               suma += i;
                   s[a-1] = i;
                   Dados(n,suma,a+1,s);
                   s[a-1] = 1;
               suma -= i;
           }
        }
    }
    public static void print(int[] s, int n){
        String str = s[0] + " + " + s[1] + " + " + s[2] + " >= " + n;
        System.out.println(str);
    }
}
