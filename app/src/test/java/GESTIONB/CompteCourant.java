package GESTIONB;

import java.util.Date;

public class CompteCourant extends Compte {
    private float decouvert ;

    public CompteCourant(float dec,String code, float S, StatutDeCompte statut) {
        super(code,S,statut);
        this.decouvert=dec;

    }
   @Override
   public void UpDateSold(){

   }
    public float getDecouvert() {
        return decouvert;
    }

    //    public void retirer(float mt) {
//        if (getSold() + decouvert >= mt ) {
//            //decouvert = mt - sold;
//            //sold += decouvert;
//            setSold((float) (getSold()-mt));
//        }
//    }
    public String toString() {
        return "le decouvert est "+this.decouvert+"  ";
    }


}