package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void feedAnimals() {
        for (Animal animal : this.animals) {
            animal.eat();
        }
    }
}
