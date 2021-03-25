package GonzaloDelaCruzCepeda;

public class E1 {
    public static void main(String[] args) {
        int[][] A = {{2,3,1,5,3},
                    {2,4,10,9,10},
                    {4,8,11,14,14},
                    {5,10,12,15,16},
                    {5,10,12,15,16}};
        int[][] sol = new int[A[0].length][A.length];
        Rotar(A,sol,0,A.length-1,0,A[0].length);
        Print(sol);
    }
    public static void Colocar (int[][] A,int[][] sol, int nInicio, int nFin, int indice){
        for (int i = nInicio; i < nFin; i++){
            sol[indice][i] = A[i][indice];
        }
    }
    public static void Print (int[][] sol){
        for (int i = 0; i < sol.length; i++){
            for (int j = 0; j < sol[0].length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Rotar(int[][] A,int[][] sol, int nInicio, int nFin, int mInicio, int mFin) {
        if (nInicio < mFin){
            int nMitad = (nInicio+nFin) / 2;
            int mMitad = (mInicio+mFin) / 2;
            Colocar(A,sol,nInicio,nMitad,0);
            Colocar(A,sol,nMitad+1,nFin,1);
            Colocar(A,sol,mInicio,mMitad,2);
            Colocar(A,sol,mMitad+1,mFin,3);
        }
    }

}
