public class IlExisteUneLigneAvecPlusieursZeros{
    /**
     * Donnée : Une matrice d' entiers
     * Résultat : retourne vrai si il existe une ligne avec plus de 0
     */
    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        int a = 0;
        boolean b = true;
        int i = 0;
        while (i < M.length && b) {
            int j = 0;
            while (j < M[0].length && b) {
                if (M[i][j] == 0) {
                    a++;
                }
                j++;
            }
            if (a > 1) {
                b = false;
            }
            a = 0;
            i++;
        }
        return b;
    }
}