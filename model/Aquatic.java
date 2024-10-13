package model;

public abstract class Aquatic extends Animal{
     int avgSwimDepth;
     WaterType waterType;

     public Aquatic(int nrOfLegs, String name) {
          super(nrOfLegs, name);
     }

     public Aquatic() {
          super();

     }
}
