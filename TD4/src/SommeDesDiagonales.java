public class SommeDesDiagonales {
    /**
     * Donnée : une matrice carrée M d' entiers
     * Résultat : retourne la somme des entiers des diagonales de M
     */
    public static int sommeDesDiagonales(int[][] M) {
        int somme = 0;
        for (int i = 0; i < M.length; i++) {
            somme += M[i][i];
            somme += M[i][M.length - 1 - i];
        }
        return somme;
    }
}
