public class Date {

    private int année;
    private int mois;
    private int jour;

    private static  String[] moisLettres = {"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"};
    public Date(int j, int m, int a) {
        this.jour = j;
        this.mois = m;
        this.année = a;
    }

    public void afficher() {
        System.out.println(this.jour + "/" + this.mois + "/" + this.année);
    }

    public void incrémenter() {
        this.jour++;
        if(this.jour > nbJoursDeMois()) {
            this.jour = 1;
            this.mois++;
        }
        if(this.mois > 12) {
            this.mois = 1;
            this.année++;
        }
    }

    public boolean anneeEstBissextile() {
        boolean bool = false;
        if(Ut.estBissextile(this.année)){
            bool = true;
        }
        return bool;
    }

    public int nbJoursDeMois() {
        int[] tab = {0, 31, 0 , 31 , 30, 31, 30, 31, 30, 31, 30, 31, 30};
        if(this.mois!=2) {
            return tab[this.mois];
        }
        else if(anneeEstBissextile()) {
            return 29;
        }
        else {
            return 28;
        }
    }

    public void moisEnLettres(){
        System.out.println(this.jour + " " + moisLettres[this.mois-1] + " " + this.année);
    }
}
