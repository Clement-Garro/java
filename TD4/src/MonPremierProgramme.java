public class MonPremierProgramme {
    /**
     * Donnée : une matrice M de m>=1 lignes
     * Résultat : retourne le numéro 1 <= i<= m d' une des lignes de M comportant
     * le plus de 0
     */
    public static void afficherTableau(int T[]) {
        for(int i=0; i < T.length; i++){
            System.out.print(T[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Bonjour le monde!");
        int[] tab={1,7,8,9,10};
        afficherTableau(tab);
    }
}