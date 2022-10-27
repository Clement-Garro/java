import java.util.Scanner;
public class MatricesEnRangée {
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : retourne la matrice transposée de T
     */
    public static void main(String[] args) {
        Matrice.afficherGrandTableau(matriceCarréesRangée());
        Ut.afficherSL("---------------------------");
        Matrice.afficherGrandTableau(matriceCarréesSerpentin());
        Ut.afficherSL("---------------------------");
        /*Matrice.afficherGrandTableau(matriceCarréesDiagonale());
        Ut.afficherSL("---------------------------");
        Matrice.afficherGrandTableau(matriceCarréesSpirale());*/
    }
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : retourne la matrice transposée de T
     */
    public static int[][] matriceCarréesRangée() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = a++;
            }
            System.out.println();
        }
        return matrice;
    }
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : retourne la matrice transposée de T
     */
    public static int[][] matriceCarréesSerpentin() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrice[i][j] = i * n + j + 1;
                } else {
                    matrice[i][j] = (i + 1) * n - j;
                }
            }
        }
        return matrice;
    }
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : retourne la matrice transposée de T
     *
    public static int[][] matriceCarréesDiagonale() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrice[i][j] = a++;
                }
            }
        }
        return matrice;
    }
    /**
     * Donnée : un tableau d' entiers carré de n rangées et n colonnes
     * Résultat : retourne la matrice transposée de T
    public static int[][] matriceCarréesSpirale() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrice[i][j] = a++;
                }
            }
        }
        return matrice;
    }
     */
}
