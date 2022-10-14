public class NombreDeZero {
    public static int nombreDeZero(int[][] M) {
        int zero =0;
        for(int i=0; i <M.length ; i++){
            for(int j=0; j < M[i].length ; j++){
                if(M[i][j] == 0){
                    zero++;
                }
            }
        }
        return zero;
    }
}
