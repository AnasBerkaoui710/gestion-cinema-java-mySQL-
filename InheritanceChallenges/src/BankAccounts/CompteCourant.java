package BankAccounts;

public class CompteCourant extends Compte {
    public double limiteDecouvert = 500;

    CompteCourant(int numero, double solde){
        super(numero, solde);
    }

}
