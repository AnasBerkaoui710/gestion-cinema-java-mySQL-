public class Reservation {
    private  int id_reser;
    private String date_reserv;
    private  Seance seance;
    private Spectateur spectateur;

    public Reservation(int id_reser,String date_reserv , Seance seance, Spectateur spectateur) {
        this.id_reser = id_reser;
        this.date_reserv = date_reserv;
        this.seance = seance;
        this.spectateur = spectateur;
    }

    public String getDate_reserv() {
        return date_reserv;
    }

    public void setDate_reserv(String date_reserv) {
        this.date_reserv = date_reserv;
    }

    public int getId_reser() {
        return id_reser;
    }

    public void setId_reser(int id_reser) {
        this.id_reser = id_reser;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Spectateur getSpectateur() {
        return spectateur;
    }

    public void setSpectateur(Spectateur spectateur) {
        this.spectateur = spectateur;
    }
}
