package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Aquatics.TUNA.equals(type)) {
            return new Tuna();

        } else if (Constants.Animals.Aquatics.STURGEON.equals(type)) {
            return new Sturgeon();

        } else if(Constants.Animals.Aquatics.SALMON.equals(type))
        {
            return new Salmon();
        }else
        {
            throw new Exception("Invalid animal");
        }

    }
}