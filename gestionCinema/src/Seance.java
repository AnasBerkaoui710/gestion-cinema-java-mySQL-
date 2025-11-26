public class Seance {
    private  String horraire;
    private String salle;
    private double capacite_max;
    private Film film;
    public Seance(String horraire,String salle,double capacite_max,Film film){
        this.horraire=horraire;
        this.salle=salle;
        this.capacite_max=capacite_max;
        this.film=film;
    }

    public double getCapacite_max() {
        return capacite_max;
    }

    public void setCapacite_max(double capacite_max) {
        this.capacite_max = capacite_max;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getHorraire() {
        return horraire;
    }

    public void setHorraire(String horraire) {
        this.horraire = horraire;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }
}

