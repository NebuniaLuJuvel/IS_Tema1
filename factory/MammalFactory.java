package factory;

import model.Animal;
import model.Cow;
import model.Dog;

class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Mammals.DOG.equals(type)) {
            return new Dog();

        } else if (Constants.Animals.Mammals.COW.equals(type)) {
            return new Cow();

        } else {
            throw new Exception("Invalid animal");
        }

    }
}