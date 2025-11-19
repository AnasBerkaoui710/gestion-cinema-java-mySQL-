package FormesGeo;

public class Cercle extends Forme {
    double radius;

    Cercle(Double radius){
        this.radius=radius;
    }

    @Override
    public double calculerArea(){
        return Math.PI*radius*radius;
    }

}
