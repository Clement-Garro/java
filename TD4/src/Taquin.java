
public class Taquin {

   
    public static void main (String [] args) {


	int[][] grilleInit1 = {
				{0,1,2,3},
				{4,5,6,7},
				{8,9,10,11},
				{12,13,15,14}
	};

	int[][] grilleInit2 = {
				{1,0,2},
				{4,5,3},
				{7,8,6}		 
	};
	
	Ut.afficher(grilleInit1);
	estSolution(grilleInit1);
	Ut.afficherSL("---------------------------");
	
	Ut.afficher(grilleInit2);
	estSolution(grilleInit2);
	Ut.afficherSL("---------------------------");
    }

	public static boolean estSolution(int[][] grille){
		int k=0;
		for(int i=0; i < grille.length; i++){
			for (int j=0; j < grille[i].length; j++){
				if(grille[i][j] != k){
					System.out.println(false);
					return false;
				}
				k++;
			}
		}
		System.out.println(true);
		return true;
	}
}
