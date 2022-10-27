public class Additionner {
    /**
       * Donnée : deux matrices d' entiers P et Q de même dimensions
       * Résultat : retourne une nouvelle matrice égale à P+ Q
       */
public static int[][] additionner(int[][] P, int[][] Q) {
    int[][] R = new int[P.length][P[0].length];
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[0].length; j++) {
                R[i][j] = P[i][j] + Q[i][j];
            }
        }
    return R;
    }
}

