package DivideVenceras;

public class IndiceIgualValor {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,7,6,8,1};
        System.out.println(IgualValor(0,a.length-1,a));
    }
    public static int IgualValor(int inicio, int fin, int[] a){
        int mitad = (inicio + fin) / 2;
        if (mitad == a[mitad]){
            return mitad;
        }
        else if (inicio>=fin){
            return -1;
        }
        else if (mitad < a[mitad]) {
            return IgualValor(inicio, mitad, a);
        }
        else {
            return IgualValor(mitad+1,fin,a);
        }

    }
}
