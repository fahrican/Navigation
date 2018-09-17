package model;

import data.Point;

public class Ship extends Vehicle {

    private int containerLoad;
    private float grossTon;
    private String type;
    private float width;

    public Ship(String description, String identification, String ownerCompany, Point position) {
        super(description, identification, ownerCompany, position);
    }

    public int getContainerLoad() {
        return containerLoad;
    }

    public void setContainerLoad(int containerLoad) {
        this.containerLoad = containerLoad;
    }

    public float getGrossTon() {
        return grossTon;
    }

    public void setGrossTon(float grossTon) {
        this.grossTon = grossTon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
