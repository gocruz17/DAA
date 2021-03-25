package ExamenMayo;
//
//
public class E3 {
//    public static void main(String[] args) {
//        String[] a = {"a","b","c"};
//        int[] r = {1,2,1};
//        int n = r.length;
//        boolean[] libres = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            libres[i] = true;
//            if (r[i] == 0) {
//                libres[i] = false;
//            }
//        }
//        permutaciones(0,a,n," ",r,);
//    }
//    public static boolean Comprobar(boolean[] libres){
//        for (int i = 0; i < libres.length-1; i++) {
//            if (libres[i] = true) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void permutaciones(int i,String[] a,int n, String sol, int[] r, boolean[] libres) {
//        for (int k = 0; k < n; k++) {
//            if(i == n-1)
//            if (libres[k]) {
//                if (sol == " "){
//                    r[k] = r[k]-1;
//                    if (r[k] == 0){
//                        libres[k] = false;
//                    }
//                    sol = a[k];
//                }
//                else {
//                    sol.concat(a[k]);
//                    r[k] = r[k]-1;
//                    if (r[k] == 0){
//                        libres[k] = false;
//                    }
//                }
//            }
//        }
//        if (Comprobar(libres))
//            permutaciones(i+1,a,n," ",r,libres);
//        else
//            System.out.println(sol);
//    }
}
