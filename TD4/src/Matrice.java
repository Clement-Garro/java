public class Matrice {
    public static void afficherGrandTableau(int M[][]) {
        for(int i=0; i < M.length; i++){
            for(int j=0; j < M[i].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] tab={{1,5,8},{2,3,6},{0,0,7}};
        afficherGrandTableau(tab);
        Ut.afficherSL("---------------------------");
        afficherGrandTableau(Additionner.additionner(tab, tab));
        Ut.afficherSL("---------------------------");
        System.out.println(SommeDesDiagonales.sommeDesDiagonales(tab));
        Ut.afficherSL("---------------------------");
        System.out.println(NombreDeZero.nombreDeZero(tab));
        Ut.afficherSL("---------------------------");
        System.out.println(LigneAvecUnMaxDeZeros.ligneAvecUnMaxDeZero(tab));
        Ut.afficherSL("---------------------------");
        System.out.println(IlExisteUneLigneAvecPlusieursZeros.ilExisteUneLigneAvecPlusieursZeros(tab));
        Ut.afficherSL("---------------------------");
        System.out.println(Sontégales.SontEgales(tab, Additionner.additionner(tab, tab)));
    }
}
