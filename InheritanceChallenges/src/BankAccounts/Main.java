package BankAccounts;

public class Main {
    public static void main(String[] args){
        Compte c1 = new Compte(111,3998.16);
        Compte c2 = new CompteCourant(222,200.99, -200);
        CompteEpargne c3 = new CompteEpargne(333,300,0.05);

        c1.verser(2);
        System.out.println("c1.solde= "+c1.solde);
        c1.retirer(5);
        System.out.println("c1.solde= "+c1.solde);

        c2.verser(2);
        System.out.println("c2.solde= "+c2.solde);
        c2.retirer(450);
        System.out.println("c2.solde= "+c2.solde);

        c3.appliquerInteret();
        System.out.println(c3.solde);




    }
}
