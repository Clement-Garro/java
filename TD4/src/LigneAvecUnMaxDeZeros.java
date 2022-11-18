public class LigneAvecUnMaxDeZeros{
    /**
     * Donnée : une matrice M de m>=1 lignes
     * Résultat : retourne le numéro 1 <= i<= m d' une des lignes de M comportant
     * le plus de 0
     */
    public static int ligneAvecUnMaxDeZeros(int[][] M) {
        int max = 0;
        int ligne = 0;
        for (int i = 0; i < M.length; i++) {
            int zero = 0;
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 0) {
                    zero++;
                }
            }
            if (zero > max) {
                max = zero;
                ligne = i;
            }
        }
        ligne++;
        return ligne;
    }
}
