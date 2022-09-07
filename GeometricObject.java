package com.Exercises.triangleAbstract;


public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Construct a default geometric object

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with color and filled value

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    // Abstract method getArea
    public abstract double getArea();

    // abstract method getPerimeter
    public abstract double getPerimeter();

}
