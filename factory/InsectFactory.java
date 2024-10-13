package factory;

import model.*;

public class InsectFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Insects.SPIDER.equals(type)) {
            return new Spider();

        } else if (Constants.Animals.Insects.COCKROACH.equals(type)) {
            return new Cockroach();
        }
            else if (Constants.Animals.Insects.BUTTERFLY.equals(type)) {
                return new Butterfly();
        } else {
            throw new Exception("Invalid animal");
        }

    }
}