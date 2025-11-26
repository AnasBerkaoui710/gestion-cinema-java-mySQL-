public class Film {
    private int id_film;
    private String titr;
    private int duree;
    private String categorie;

    public Film(int id_film, String titr, int duree, String categorie) {
        this.id_film = id_film;
        this.titr = titr;
        this.duree = duree;
        this.categorie = categorie;
    }

    public int getId_film() {
        return id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    public String getTitr() {
        return titr;
    }

    public void setTitr(String titr) {
        this.titr = titr;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
