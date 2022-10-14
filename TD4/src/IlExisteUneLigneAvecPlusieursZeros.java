public class IlExisteUneLigneAvecPlusieursZeros{
    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        boolean b=false;
        for (int i = 0; i < M.length; i++) {
            int zero = 0;
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 0) {
                    zero++;
                }
            }
            if (zero > 1) {
                b=true;
            }
        }
        return b;
    }
}