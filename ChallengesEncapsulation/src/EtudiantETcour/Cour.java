package EtudiantETcour;

import java.util.ArrayList;
import java.util.List;

public class Cour {
    private int id;
    private String titre;
    private List<Etudiant> inscrits;

    public Cour(int id, String titre) {
        this.id = id;
        this.titre = titre;
        inscrits= new ArrayList<>();    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Etudiant> getInscrits() {
        return inscrits;
    }

    public void setInscrits(List<Etudiant> inscrits) {
        this.inscrits = inscrits;
    }




public void ajouterEtudiant(Etudiant e){
        inscrits.add(e);

}

    @Override
    public String toString() {
        return "Cour{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", inscrits=" + inscrits +
                '}';
    }
}
