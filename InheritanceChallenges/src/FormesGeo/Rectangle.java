package FormesGeo;

public class Rectangle extends Forme {
    double longueur;
    double largeur;

    Rectangle(double longueur, double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public double calculerArea(){
        return longueur*largeur;
    }


}
