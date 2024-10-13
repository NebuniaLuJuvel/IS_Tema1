package model;

public abstract class Bird extends Animal {
     boolean migrates;
     int avgFlightAltitude;

     public Bird(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude) {
          super(nrOfLegs, name);
          this.migrates = migrates;
          this.avgFlightAltitude = avgFlightAltitude;
     }

     public Bird(boolean migrates, int avgFlightAltitude) {
          this.migrates = migrates;
          this.avgFlightAltitude = avgFlightAltitude;
     }
     public Bird()
     {
          migrates=true;
          avgFlightAltitude=100;
          setNrOfLegs(2);

     }
}
