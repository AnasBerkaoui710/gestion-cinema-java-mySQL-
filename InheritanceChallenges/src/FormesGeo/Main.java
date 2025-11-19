package FormesGeo;

public class Main {


    public static void main(String[] args){
//        Forme cercle = new Cercle(4.0);
//        Forme rectangle = new Rectangle(4.0,3.0);
        //Forme cercle = new Cercle(4.0);

        Forme[] formes={
                new Cercle(4.0),
                new Rectangle(4.0,3.0)

        };

        for (int i = 0; i < formes.length; i++) {
            System.out.println("surface: "+formes[i].calculerArea());

        }





//        System.out.println("la surface du cercle est: "+cercle.calculerArea());
//        System.out.println("la surface du rectangle est: "+rectangle.calculerArea());

    }



}
