public class MonPremierProgramme {
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