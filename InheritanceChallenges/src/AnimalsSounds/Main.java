package AnimalsSounds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Chien());
        animals.add(new Chat());
        animals.add(new Vache());

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).faireSon();
        }

    }
}
