import java.util.Scanner;
import static java.lang.Math.sqrt;
public class CarréParfait {
    /**
     * Donnée : Un nombre n
     * Résultat : retourne vrai si n est un carré parfait
     */
    public static int racineParfaite() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = (int) sqrt(n);
        String txt="";
        if( n == c*c ){
            System.out.println(c);
            return c;
        }
        else{
            c = -1;
            System.out.println(c);
            return c;
        }
    }
}
