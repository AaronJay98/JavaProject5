package edu.sjsu.macaldo.aaronjay;

public class IceCreamCone {

    private double height;
    private double radius;

    public IceCreamCone() {
        height = 10.50;
        radius = 3.70;
    }

    public IceCreamCone(double inputHeight, double inputRadius) {
        height = inputHeight;
        radius = inputRadius;
    }

    public void setHeight(double inHeight) {
        if(inHeight >= 0)
            height = inHeight;

    }

    public void setRadius(double inRadius) {
        if(inRadius >= 0)
            radius = inRadius;

    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return Math.PI * radius * Math.sqrt(height * height + radius * radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height / 3;
    }

}
