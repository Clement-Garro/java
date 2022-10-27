import java.util.Scanner;
public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrice = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println(estUnSudoku(matrice));
    }
    public static boolean estUnSudoku(int[][] M) {
        boolean b = true;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] < 1 || M[i][j] > 9) {
                    b = false;
                }
            }
        }
        return b;
    }
}
