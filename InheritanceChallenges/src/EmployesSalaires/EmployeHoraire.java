package EmployesSalaires;

    class EmployeHoraire extends Employe {
    int heuresTravaillees;
    double tauxHoraire;



        EmployeHoraire(String nom,double salaireBase, int heuresTravaillees, double tauxHoraire) {
            super(nom,salaireBase);
            this.tauxHoraire = tauxHoraire;
            this.heuresTravaillees = heuresTravaillees;
        }




        @Override
        public double calculerSalaire(){
        return heuresTravaillees*tauxHoraire;
    }

}
