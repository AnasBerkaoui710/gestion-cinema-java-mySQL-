package BankAccounts;

public class CompteEpargne extends Compte {
    double tauxInteret;

    CompteEpargne(int numero,double solde, double tauxInteret){
        super(numero, solde);
        this.tauxInteret=tauxInteret;

    }
    public void appliquerInteret(){

    }

}
