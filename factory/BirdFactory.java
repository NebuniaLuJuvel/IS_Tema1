package factory;

import model.*  ;


class BirdFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Birds.PIDGEON.equals(type)) {
            return new Pidgeon();

        } else if (Constants.Animals.Birds.CROW.equals(type)) {
            return new Crow();

        }
        else if (Constants.Animals.Birds.FALCON.equals(type)) {
            return new Falcon();

        }else {
            throw new Exception("Invalid animal");
        }

    }
}