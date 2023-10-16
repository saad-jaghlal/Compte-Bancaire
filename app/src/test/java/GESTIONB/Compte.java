package GESTIONB;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ExceptionP.soldinsiffusionException;
import ExceptionP.montantnegativeException;

public abstract  class  Compte implements iCompte {
    private String code;
    private double sold;
    public static int nbCompte;
     private List<Operation> operations ;

    private  StatutDeCompte statut;
    public Compte() {

    }

    public Compte(String code,double sold,StatutDeCompte statut) {
        this.code = code;
        this.sold =sold;
        this.statut = statut;
        this.operations = new ArrayList<>();
    }
    public String getCode() {
    	return code;
    }
    public double consulterSolde(){
        return sold;
    }
    public void UpDateSold(double  s){
        this.sold =s;

    }
    
    public void verser(double mt) throws Exception{
        if(mt>0){
            this.sold +=mt;
            operations.add(new Versement(new Date(),mt));
        }
        else throw new montantnegativeException("montant  negative imposible");
    }
    public void retirer(double mt) throws /*soldinsiffusionException ,montantnegativeException*/ Exception{
//        if (mt >= this.sold) throw new soldinsiffusionException("sold insiffusion");{
//
//            this.sold -= mt;
//            if(mt<=0) throw new montantnegativeException("montant negative");
//
//        }
        if (mt > 0) {
            if (this instanceof CompteEpargne) {
                if (mt <= sold) {
                    sold -= mt;
                    operations.add(new Retirer(new Date(), mt));
                } else {
                    throw new soldinsiffusionException("Solde insuffisant.");
                }
            } else if (this instanceof CompteCourant) {
                if (sold +((CompteCourant) this).getDecouvert() >= mt) {
//                    System.out.println(((CompteCourant) this).getDecouvert());
                    sold -= mt;
                    operations.add(new Retirer(new Date(), mt));
                } else {
                    throw new soldinsiffusionException("Solde insuffisant.");
                }
            }
        }else throw new montantnegativeException("montant negative !");
    }
    public void Virement(Compte C, double mt) throws Exception{
        this.retirer(mt);
        C.verser(mt);
    }
//    public String toString() {
//        return " le code est "+ this.code+" et sold est "+this.sold;
//
//    }


    public List<Operation> getOperations() {

//        for (Operation oper:operations ){
//            System.out.println(oper.getDateOperation()+" "+oper.getMontant());
//        }
        return operations;
    }
    public double TotalVersements() {
        double total = 0;
        for (Operation operation : operations) {
            if (operation instanceof Versement) {
                total += operation.getMontant();
            }
        }
        return total;
    }
    public double TotalRetraits() {
        double total = 0;
        for (Operation operation : operations) {
            if (operation instanceof Retirer) {
                total += operation.getMontant();
//                System.out.println(operation.getDateOperation());
            }
        }
        return total;
    }
    public void ecrireHistorique(String nomFichier) {
        try {
//            FileWriter writer = new FileWriter(nomFichier);
            PrintWriter out = new PrintWriter(new FileWriter(nomFichier));

            for (Operation operation : operations) {
                out.println(operation.toString() + "\n");
            }

            out.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
