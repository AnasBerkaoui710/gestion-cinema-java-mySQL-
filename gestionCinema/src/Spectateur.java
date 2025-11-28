public class Spectateur {

    private int id_spectateur;
    private String nom;
    private String email;
    private Reservation reservation;  // Lien 1-1 avec la réservation

    public Spectateur(int id_spectateur, String nom , String email) {
        this.id_spectateur = id_spectateur;
        this.nom = nom;
        this.email = email;
    }

    // Méthode du diagramme
    public void reserverSeance(Seance seance) {
        System.out.println("Le spectateur " + this.nom + " réserve la séance de " + seance.getFilm().getTitre());
        // Logique de réservation serait ici
    }

    // Getters et Setters
    public int getId_spectateur()
    { return id_spectateur; }

    public String getNom()
    { return nom; }

    public String getEmail()
    { return email; }

    public Reservation getReservation()
    { return reservation; }
    // Setters
    public void setReservation(Reservation reservation)
    { this.reservation = reservation; }

}
