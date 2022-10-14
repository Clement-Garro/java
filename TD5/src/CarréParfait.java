import java.util.Scanner;

import static java.lang.Math.sqrt;
public class CarréParfait {
    public static void racineParfaite() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = (int) sqrt(n);
        if( n == c*c ){
            System.out.println("la racine carré du nombre " + n + " est " + c + ", et " + c + " * " + c + " = " + n + " Donc c'est une racine parfaite");
        }
        else System.out.println(-1);
    }
}
