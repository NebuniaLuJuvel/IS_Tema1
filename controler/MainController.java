package controler;

import factory.*;
import model.*;

public class MainController {

    public static void main(String[] args) throws Exception {
        AnimalFactory abstractFactory = new AnimalFactory();
        SpeciesFactory mamalSpeciesFactory=

                abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);

        Animal lorenzoTheCow =
                mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.COW);
        System.out.printf("We have an animal with %d legs!\n",

                lorenzoTheCow.getNrOfLegs());

    }}
