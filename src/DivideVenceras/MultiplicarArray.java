package DivideVenceras;

public class MultiplicarArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,7};
        System.out.println(SumaArray(0,a.length-1,a));
    }
    public static int SumaArray (int inicio, int fin, int[] a){
        if (inicio == fin){
            return a[inicio];
        }
        int mitad = (inicio + fin) / 2;
        int x = SumaArray(inicio,mitad,a);
        int y = SumaArray(mitad+1,fin,a);
        return (x * y);
    }
}
