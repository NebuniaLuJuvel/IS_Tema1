package model;

public abstract class Animal {
    private int nrOfLegs;
    private String name;

    public Animal(int nrOfLegs, String name) {
        this.nrOfLegs = nrOfLegs;
        this.name = name;
    }

    public Animal() {
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }
    public void setNrOfLegs(int num)
    {
        nrOfLegs=num;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
