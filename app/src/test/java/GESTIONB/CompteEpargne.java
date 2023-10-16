package GESTIONB;

public class CompteEpargne extends Compte {
    private  int taux =5;
    public CompteEpargne(int taux, String code,double So ,StatutDeCompte statut){
        super(code,So,statut);
        this.taux = taux;

    }

    public void UpDateSold(){
         super.UpDateSold(super.consulterSolde()*(1+taux/100));
    }
    public String toString() {
        return "Compte Epargne" + super.toString() + " taux= " + taux ;
    }
}
