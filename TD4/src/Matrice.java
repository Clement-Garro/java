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
//        int[][] tab={{0,0,0,0},{1,0,3},{1}};
//        afficherGrandTableau(tab);
//        Ut.afficherSL("---------------------------");
//        afficherGrandTableau(Additionner.additionner(tab, tab));
//        Ut.afficherSL("---------------------------");
//        System.out.println(SommeDesDiagonales.sommeDesDiagonales(tab));
//        Ut.afficherSL("---------------------------");
//        System.out.println(NombreDeZeros.nombreDeZeros(tab));
//        Ut.afficherSL("---------------------------");
//        System.out.println(LigneAvecUnMaxDeZeros.ligneAvecUnMaxDeZero(tab));
//        Ut.afficherSL("---------------------------");
//        System.out.println(IlExisteUneLigneAvecPlusieursZeros.ilExisteUneLigneAvecPlusieursZeros(tab));
//        Ut.afficherSL("---------------------------");
//        System.out.println(SontÉgales.sontÉgales(tab, Additionner.additionner(tab, tab)));
        int[][] M = new int[3][3];
        CarréMagique.remplirEnCarréMagique(M);
        CarréMagique.afficherCarré(M);
        System.out.println(CarréMagique.cEstUnCarréMagique(M));
    }
}
