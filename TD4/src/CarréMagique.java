import java.util.Arrays;

public class CarréMagique {
        /**
         * Donnée : un tableau carré de n * n entiers ( n impair)
         * Résultat : remplit le tableau de sorte que la somme des entiers de chaque
         * rangée égale la somme des entiers de chaque colonne et la somme des
         * entiers de chacune des deux diagonales
         */
        public static void remplirEnCarréMagique(int[][] M){
            for(int i = 0; i < M.length; i++) {
                for( int j = 0; j < M[0].length; j++){
                    M[i][j] = 0;
                }
            }
            int n = M.length;
            int i = 0;
            int j = n/2;
            int k = 1;
            while (k <= n*n) {
                M[i][j] = k++;
                int i2 = i;
                int j2 = j;
                i--;
                j++;
                if (i < 0) {
                    i = n-1;
                }
                if (j >= n) {
                    j = 0;
                }
                if (M[i][j] != 0) {
                    i = i2 + 1;
                    j = j2;
                }
            }
        }

    /**
     * Donnée: un carré magique CM
     * Résultat: complete le carré magique CM en le remplissant avec les nombres
     */
    public static int constanteMagiqueDe(int[][] CM){
        int n = CM.length;
        int somme = 0;
        for (int i = 0; i < n; i++) {
            somme += CM[0][i];
        }
        return somme;
    }
    /**
     * Donnée : un tabeau d' entiers 2D
     * Résultat : retourne la matrice transposée de T
     */
    public static boolean cEstUnCarréMagique(int[][] T){
        boolean b = true;
        int n = T.length;
        int somme = constanteMagiqueDe(T);
        for (int i = 0; i < n; i++) {
            int sommeLigne = 0;
            int sommeColonne = 0;
            for (int j = 0; j < n; j++) {
                sommeLigne += T[i][j];
                sommeColonne += T[j][i];
            }
            if (sommeLigne != somme || sommeColonne != somme) {
                b = false;
            }
        }
        int sommeDiagonale1 = 0;
        int sommeDiagonale2 = 0;
        for (int i = 0; i < n; i++) {
            sommeDiagonale1 += T[i][i];
            sommeDiagonale2 += T[i][n-1-i];
        }
        if (sommeDiagonale1 != somme || sommeDiagonale2 != somme) {
            b = false;
        }
        return b;
    }
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : affiche le tableau une rangée par ligne et en séparant les
     * entiers sur chaque ligne par une tabulation
     */
    public static void afficherCarré(int[][] carré){
        for (int i = 0; i < carré.length; i++) {
            for (int j = 0; j < carré[i].length; j++) {
                System.out.print(carré[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
