package GESTIONB;

import java.util.Date;

public class Operation {
    private int  numero;
    private Date dateOperation;
    private double montant;
    public Operation(int num,Date date ,double mt){
        this.dateOperation = date;
        this.montant = mt;
        this.numero = num;
    }

    public Date getDateOperation() {
        return dateOperation;
    }
    public double getMontant() {
        return montant;
    }

    public int getNumero() {
        return numero;
    }
}
