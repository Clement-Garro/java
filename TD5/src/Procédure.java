import java.util.Scanner;
public class Procédure {
    /**
     * Donnée : rien
     * Résultat : affiche tout les résultat des fonctions.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Mutiplication.multiplication(n);
        Ut.afficherSL("---------------------------");
        //NumérationRomaine.afficher();
        Ut.afficherSL("---------------- -----------");
        CarréParfait.racineParfaite();
    }
}
