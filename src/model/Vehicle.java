package model;

import data.Point;

public abstract class Vehicle {

    private String description;
    private String identification;
    private String ownerCompany;
    private Point position;

    public Vehicle(String description, String identification, String ownerCompany, Point position) {
        this.description = description;
        this.identification = identification;
        this.ownerCompany = ownerCompany;
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public String getIdentification() {
        return identification;
    }

    public String getOwnerCompany() {
        return ownerCompany;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName()
                + ": " + this.getDescription());
    }
}
