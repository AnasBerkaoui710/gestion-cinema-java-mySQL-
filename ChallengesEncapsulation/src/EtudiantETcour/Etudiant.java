package EtudiantETcour;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private List<Cour> coursSuivis;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        coursSuivis= new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Cour> getCoursSuivis() {
        return coursSuivis;
    }

    public void setCoursSuivis(List<Cour> coursSuivis) {
        this.coursSuivis = coursSuivis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void inscrire(Cour c){
        coursSuivis.add(c);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", coursSuivis=" + coursSuivis +
                '}';
    }
}
