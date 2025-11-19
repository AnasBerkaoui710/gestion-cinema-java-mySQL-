package EmployesSalaires;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

    List<Employe> employes = new ArrayList<>();

    employes.add(new Employe("Soufiane", 3000));
    employes.add(new EmployeCommission("Ayoub", 5000, 20, 30));
    employes.add(new EmployeHoraire("Anas", 2000, 40, 50));
    employes.add(new EmployeHoraire("Hayat", 4500, 10, 25));

        for (int i = 0; i < employes.size(); i++) {
            System.out.println("le salaire de "+employes.get(i).nom+" est "+employes.get(i).calculerSalaire()+" DHs.");
        }
    }
}
