package EmployesSalaires;

    class Employe {
    String nom;
    double salaireBase;

        public Employe(String nom, double salaireBase) {
            this.nom=nom;
            this.salaireBase=salaireBase;

        }

        double calculerSalaire(){
        return salaireBase;
    }

}
