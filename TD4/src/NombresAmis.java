import java.util.Scanner;
public class NombresAmis {
    /**
     * Donnée : deux entiers p et q
     * Résultat : retourne vrai si p et q sont amis, faux sinon
     */
    public static boolean amis(int p, int q) {
        int sommeDiviseursP = 0;
        int sommeDiviseursQ = 0;
        for (int i = 1; i < p; i++) {
            if (p % i == 0) {
                sommeDiviseursP += i;
            }
        }
        for (int i = 1; i < q; i++) {
            if (q % i == 0) {
                sommeDiviseursQ += i;
            }
        }
        return sommeDiviseursP == q && sommeDiviseursQ == p;
    }

    public static void afficherAmis(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (amis(i, j)) {
                    System.out.println(i + " et " + j + " sont amis");
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int q = scanner2.nextInt();
        System.out.println(amis(p, q));
        System.out.println("choisir un nombre n : ");
        Scanner scanner3 = new Scanner(System.in);
        int n = scanner3.nextInt();
        afficherAmis(n);
    }
}
