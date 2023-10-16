package GESTIONB;

public class Main {
    public static void main(String[] args) {
        //        C1.calculInterets();
//        System.out.println(C1.toString());
//        System.out.println(C2.toString());
//        System.out.println(C3.toString());
//        System.out.println(C4.toString());

//        CompteEpargne C1 = new CompteEpargne(5 ,800);
//        Compte C2 = new Compte(6000 );

//        ComptePayant C4 = new ComptePayant(30);
//


//        C2.retirer(3500);
//        C2.retirer(2000);
//        System.out.println(C3.toString()+((CompteCourant) C5).getDecouvert());
        CompteCourant C3 = new CompteCourant(40,"c103",5000,StatutDeCompte.CREATED);
        CompteCourant C4 = new CompteCourant(40,"c104",5000,StatutDeCompte.CREATED);
        Compte C5 = new CompteEpargne(5,"c105",0,StatutDeCompte.CREATED);
        Compte C6 = new CompteEpargne(6,"c106",0,StatutDeCompte.CREATED);
        Banque B1 = new Banque();
        try{
//            C3.retirer(3000);
//            C3.verser(20000);
//            C3.verser(5000);
//            C3.Virement(C5,5000);
        	 B1.ajouter(C3);
        	  B1.ajouter(C5);
        	  B1.ajouter(C6);
//        	  B1.ajouter(C4);
        	
        }
//        catch (soldinsiffusionException e){
//            System.out.println(e.getMessage());
//        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
        B1.afficher();
        System.out.println(B1.Supprimer(C4));
        System.out.println(B1.IndiceCompte("c104"));
//        System.out.println(C3.getOperations());
//        System.out.println(C3.TotalRetraits());
//        System.out.println(C3.TotalVersements());
//        System.out.println(C5.TotalVersements());
//        C3.ecrireHistorique("clinet1.txt");
//System.out.println(B1.nombreDesComptes());




    }
}
