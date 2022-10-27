import java.util.Scanner;
public class ChiffresRomains {
    /**
     * Donnée : Un entier n > 0 et < 3999
     * Résultat : affiche n en chiffres romains
     */
    public static void chiffreUnites(int nb) {
        switch(nb){
            case 0 -> System.out.print("");
            case 1 -> System.out.print("I");
            case 2 -> System.out.print("II");
            case 3 -> System.out.print("III");
            case 4 -> System.out.print("IV");
            case 5 -> System.out.print("V");
            case 6 -> System.out.print("VI");
            case 7 -> System.out.print("VII");
            case 8 -> System.out.print("VIII");
            case 9 -> System.out.print("IX");
        }
    }
    public static void chiffreDizaines(int nb) {
        switch (nb){
            case 1 -> System.out.print("X");
            case 2 -> System.out.print("XX");
            case 3 -> System.out.print("XXX");
            case 4 -> System.out.print("XL");
            case 5 -> System.out.print("L");
            case 6 -> System.out.print("LX");
            case 7 -> System.out.print("LXX");
            case 8 -> System.out.print("LXXX");
            case 9 -> System.out.print("XC");
        }
    }
    public static void chiffreCentaines(int nb) {
        switch (nb){
            case 1 -> System.out.print("C");
            case 2 -> System.out.print("CC");
            case 3 -> System.out.print("CCC");
            case 4 -> System.out.print("CD");
            case 5 -> System.out.print("D");
            case 6 -> System.out.print("DC");
            case 7 -> System.out.print("DCC");
            case 8 -> System.out.print("DCCC");
            case 9 -> System.out.print("CM");
        }
    }
    public static void chiffreMilliers(int nb) {
        switch (nb){
            case 1 -> System.out.print("M");
            case 2 -> System.out.print("MM");
            case 3 -> System.out.print("MMM");
        }
    }
    public static void afficherEnChiffreRomain(int nb) {
        chiffreMilliers(((nb/1000)%10));
        chiffreCentaines((nb/100)%10);
        chiffreDizaines(((nb/10)%10));
        chiffreUnites((nb%10));
    }

    public static void chiffreRomains() {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        while(a>3999 || a <0){
            System.out.println("entrez une valeur en 0 et 3999");
            a = scanner1.nextInt();
        }
        afficherEnChiffreRomain(a);
    }
}
