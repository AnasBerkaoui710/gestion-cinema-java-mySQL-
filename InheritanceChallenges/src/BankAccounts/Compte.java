package BankAccounts;

public class Compte {
    public int numero;
    public double solde;

    Compte(int numero, double solde){
     this.numero=numero;
     this.solde=solde;
    }
    public double verser(double montant){
        System.out.println("versemment effectué avac suucees!!");
        return solde += montant;
    }

    public double retirer(double montant){
        if(montant<=solde){
            System.out.println("retirement efffectué avec succee!!");
            return solde -= montant;
        }else{
            System.out.println("Solde insufisant !!!");
            return solde;
        }
    }
}
