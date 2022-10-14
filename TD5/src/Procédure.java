import java.util.Scanner;
public class Procédure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Mutiplication.multiplication(n);
        Ut.afficherSL("---------------------------");
        ChiffresRomains.chiffreRomains();
        Ut.afficherSL("---------------------------");
        CarréParfait.racineParfaite();
    }
}
