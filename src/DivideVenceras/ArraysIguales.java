package DivideVenceras;

public class ArraysIguales {
    public static void main(String[] args) {
        int[] a = {3,1,5,2,7};
        int[] b = {3,1,7,2,7};
        System.out.println(Iguales(0,a.length-1,a,b));
    }
    public static boolean Iguales(int inicio, int fin, int[] a, int[] b){
        if (inicio == fin)
            return a[inicio] == b[inicio];
        int mitad = (inicio + fin) / 2;
        boolean x = Iguales(inicio,mitad,a,b);
        boolean y = Iguales(mitad+1,fin,a,b);
        return (x == y);
    }
}
