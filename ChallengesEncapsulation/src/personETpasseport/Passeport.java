package personETpasseport;

public class Passeport {
   private int numero;
   private String nationalite;
   private String dateExpiration;

public Passeport(int numero, String nationalite, String dateExpiration){
    this.numero=numero;
    this.nationalite=nationalite;
    this.dateExpiration=dateExpiration;
}

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }



    public void afficherPasseport(){
        System.out.println("===Passeport===");
        System.out.println("numero: "+getNumero());
        System.out.println("Nationalité: "+getNationalite());
        System.out.println("Date d'expiration: "+getDateExpiration());

    }

    @Override
    public String toString() {
        return "Passeport{" +
                "numero=" + numero +
                ", nationalite='" + nationalite + '\'' +
                ", dateExpiration='" + dateExpiration + '\'' +
                '}';
    }
}
