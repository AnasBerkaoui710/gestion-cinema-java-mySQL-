package EmployesSalaires;

public class EmployeCommission extends Employe {
    public double ventes;
    public double commission;

    EmployeCommission(String nom, double salaireBase, double ventes, double commission){
        super(nom, salaireBase);
        this.ventes=ventes;
        this.commission=commission;
    }


    @Override
    public double calculerSalaire(){
        return salaireBase+ ( ventes * commission );
    }

}
