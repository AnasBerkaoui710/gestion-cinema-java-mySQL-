package CourETinstructeur;

import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private List<Cour> coursEnseignes;




    public Instructeur(int id, String nom, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
        coursEnseignes= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public List<Cour> getCoursEnseignes() {
        return coursEnseignes;
    }

    public void setCoursEnseignes(List<Cour> coursEnseignes) {
        this.coursEnseignes = coursEnseignes;
    }

    public void ajouterCour(Cour c){
        coursEnseignes.add(c);
        System.out.println("cour ajouté avec succés !! ");
    }

    public void afficherCours(){
        System.out.println(coursEnseignes);
    }

    @Override
    public String toString() {
        return "Instructeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", coursEnseignes=" + coursEnseignes +
                '}';
    }
}
