package BankAccounts;

public class Compte {
    public int numero;
    public double solde;

    Compte(int numero, double solde){
     this.numero=numero;
     this.solde=solde;
    }
    public void verser(double montant){
        solde += montant;
    }

    public void retirer(double montant){
        solde -= montant;
    }
}
