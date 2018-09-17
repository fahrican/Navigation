package model;

import data.Point;

public class Lorry extends Vehicle {

    private int euroClass;
    private int numberOfAxis;
    private int weight;

    public Lorry(String description, String identification, String ownerCompany, Point position) {
        super(description, identification, ownerCompany, position);
    }

    public int getEuroClass() {
        return euroClass;
    }

    public void setEuroClass(int euroClass) {
        this.euroClass = euroClass;
    }

    public int getNumberOfAxis() {
        return numberOfAxis;
    }

    public void setNumberOfAxis(int numberOfAxis) {
        this.numberOfAxis = numberOfAxis;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
