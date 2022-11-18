import java.util.Scanner;
public class NumérationRomaine {
    /**
     * Donnée : le chiffre des unités de n
     * Résultat : affiche le chiffre des unités de n en romains
     */
    public static String unités(int nb) {
        String s = "";
        switch(nb){
            case 0 -> s="";
            case 1 -> s="I";
            case 2 -> s="II";
            case 3 -> s="III";
            case 4 -> s="IV";
            case 5 -> s="V";
            case 6 -> s="VI";
            case 7 -> s="VII";
            case 8 -> s="VIII";
            case 9 -> s="IX";
        }
        return s;
    }
    /**
     * Donnée : le chiffre des dizaines de n
     * Résultat : affiche le chiffre des dizaines de n en romains
     */
    public static String dizaines(int nb) {
        String s ="";
        switch (nb){
            case 1 -> s="X ";
            case 2 -> s="XX ";
            case 3 -> s="XXX ";
            case 4 -> s="XL ";
            case 5 -> s="L ";
            case 6 -> s="LX ";
            case 7 -> s="LXX ";
            case 8 -> s="LXXX ";
            case 9 -> s="XC ";
        }
        return s;
    }
    /**
     * Donnée : le chiffre des centaines de n
     * Résultat : affiche le chiffre des centaines de n en romains
     */
    public static String centaines(int nb) {
        String s = "";
        switch (nb){
            case 1 -> s = "C ";
            case 2 -> s = "CC ";
            case 3 -> s = "CCC ";
            case 4 -> s = "CD ";
            case 5 -> s = "D ";
            case 6 -> s = "DC ";
            case 7 -> s = "DCC ";
            case 8 -> s = "DCCC ";
            case 9 -> s = "CM ";
        }
        return s;
    }
    /**
     * Donnée : Un entier 0 <= n <= 999
     * Résultat : affiche n en chiffres romains avec des espaces entre les chiffres
     */
    public static void afficher(int nb) {
        if(nb < 0){
            System.out.print("-");
            nb = Math.abs(nb);
        }
        System.out.print(centaines((nb/100)%10));
        System.out.print(dizaines((nb/10)%10));
        System.out.println(unités((nb%10)));
    }
}
