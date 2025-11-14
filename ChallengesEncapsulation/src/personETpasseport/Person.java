package personETpasseport;

public class Person {
    private String nom;
    private int age;
    private Passeport passeport;


    public Person(String nom, int age){
        this.nom=nom;
        this.age=age;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }

    public void assignerPasseport(Passeport p){
        this.passeport=p;
    }

    public void afficherInfos(){
        System.out.println("===Personne===");
        System.out.println("Nom: "+getNom());
        System.out.println("Age: "+getAge());
        System.out.println("Passeport: "+getPasseport());
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", passeport=" + passeport +
                '}';
    }
}
