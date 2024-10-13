package model;

public abstract class Reptile extends Animal {
     boolean laysEggs;
     public Reptile()
     {
          super();
     }
     public Reptile(int nrOfLegs, String name, boolean laysEggs) {
          super(nrOfLegs, name);
          this.laysEggs = laysEggs;
     }

     public Reptile(boolean laysEggs) {
          this.laysEggs = laysEggs;
     }
}
