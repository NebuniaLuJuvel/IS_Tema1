package factory;

import model.*;

class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Reptiles.LIZZARD.equals(type)) {
            return new Lizzard();

        } else if (Constants.Animals.Reptiles.TURTLE.equals(type)) {
            return new Turtle();

        }
        else if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
            return new Snake();

        }else {
            throw new Exception("Invalid animal");
        }

    }
}