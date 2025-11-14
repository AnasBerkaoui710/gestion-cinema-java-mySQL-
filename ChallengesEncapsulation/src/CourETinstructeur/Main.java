package CourETinstructeur;

public class Main {
    public static void main(String[] args){
        Cour c1 = new Cour(1,"la boite à merveilles. ","premier roman au 1Bac s.");
        Cour c2 = new Cour(2,"Antigone. ","deuxième roman au 1Bac s.");
        Cour c3 = new Cour(3,"le dernier jour d'un condamné. ","troisième roman au 1Bac s.");

    Instructeur i1 = new Instructeur(1,"Anas","Maths");


    i1.ajouterCour(c3);

    i1.afficherCours();
}

}
