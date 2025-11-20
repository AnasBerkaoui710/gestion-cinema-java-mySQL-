package BankAccounts;

public class CompteCourant extends Compte {
    public double limiteDecouvert;

    CompteCourant(int numero, double solde){
        super(numero, solde);
        this.limiteDecouvert=limiteDecouvert;
    }

    @Override
    public double verser(double montant){
        System.out.println("versemment effectué avac suucees!!");
        return solde += montant;
    }
    


    @Override
    public double retirer(double montant){
        if(solde-montant>limiteDecouvert){
            System.out.println("retirement effectué avac suucees!!");
            return solde-=montant;

        }else{
            System.out.println("vous avez atteit la limite decouvert!!!");
            return solde;
        }
    }

}
