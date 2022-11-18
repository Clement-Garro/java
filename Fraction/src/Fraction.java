import java.lang.*;

public class Fraction {

    private int numerateur;

    private int denominateur; // Invariant : different de 0

    public Fraction (int num, int denom) {
        /*  Action : constructeur a partir de deux entiers.
         *  Pre-requis : denom est different de 0 !
         */
        this.numerateur = num;
        this.denominateur = denom;
    }

    public Fraction (Fraction frac) { // constructeur par recopie frac --> this
        this.numerateur = frac.numerateur;
        this.denominateur = frac.denominateur;
        // Rmq : peut s'écrire en faisant appel au constructeur precedent : this(frac.numerateur, frac.denominateur);
    }

    public Fraction fois(Fraction f) {
        Fraction resultat = new Fraction(this.numerateur * f.numerateur, this.denominateur * f.denominateur);
        return resultat;
    }
    public Fraction plus(Fraction f){
        Fraction resultat = new Fraction(this.numerateur * f.denominateur + f.numerateur * this.denominateur, this.denominateur * f.denominateur);
        return resultat;
    }

    public Fraction puissance(int n){
        Fraction resultat = new Fraction((int) Math.pow(this.numerateur, n), (int) Math.pow(this.denominateur, n));
        return resultat;
    }

     public boolean égale(Fraction f)  {
        Fraction f1 = new Fraction(this.numerateur , this.denominateur);
        if(this.numerateur * f.denominateur == this.denominateur * f.numerateur) {
            return true;
        } else return false;
    }

    public boolean estIrréductible() {
        Fraction f = this.fractionReduite();
        return (f.numerateur == this.numerateur && f.denominateur == this.denominateur);
    }
    public Fraction (String strFrac) {
	/* Action : constructeur a partir d'une chaine de caracteres.
	   Pre-requis : strFrac est une chaine de caracteres correspondant a une fraction, par exemple "13/26"

	   Remarque pedagogique : parseInt est une methode de classe (Integer) ;
	   split est une methode d'instance (strFrac)
	*/
        String str[];   // declaration d'un tableau de chaines de caracteres
        str = strFrac.split("/");  // Appel de la methode 'split' d'un objet de classe String : eclatement de strFrac en plusieurs sous-chaines separees par des '/' et rangees
        // dans str. Exemple : si strFrac=="13/26", alors str[0] vaut "13" et str[1] vaut "26".
        this.numerateur = Integer.parseInt(str[0]);    // La methode de la classe Integer permet de traduire la chaine en argument en Integer...
        // Java sait automatiquement transformer (on dit "caster" ou "faire un cast" - anglicisme) une valeur Integer vers int.
        this.denominateur = Integer.parseInt(str[1]);
    }


    // public void affiche() {
    // !! Mieux vaut utiliser toString() ci-apres !!
    //	System.out.println("Fraction = " + this.numerateur + " / " + this.denominateur);
    // }

    public String toString() {
        return this.numerateur + "/" + this.denominateur;
    }

    /* A COMPLETER A PARTIR D'ICI !! */
    public void reduire() {
        int a = this.numerateur;
        int b = this.denominateur;
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        this.numerateur = this.numerateur / a;
        this.denominateur = this.denominateur / a;
    }

    public Fraction fractionReduite () {
        Fraction f = new Fraction(this.numerateur, this.denominateur);
        f.reduire();
        return f;
    }
    // Dans terminal : [javac Fraction] ; javac MainFraction.java ;  java MainFraction

}
