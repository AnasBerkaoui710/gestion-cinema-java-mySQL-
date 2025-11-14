package EtudiantETcour;

public class Main {
    public static void main(String[] args){
     Etudiant e1 = new Etudiant(1,"anas berk");
     Etudiant e2 = new Etudiant(2,"zyad berk");

     Cour c1 = new Cour(1,"la boîte à merveilles. ");
     Cour c2 = new Cour(2,"Antigone. ");

     c1.ajouterEtudiant(e1);
     System.out.println(c1);


     e1.inscrire(c2);
        System.out.println(e1);

    }
}
