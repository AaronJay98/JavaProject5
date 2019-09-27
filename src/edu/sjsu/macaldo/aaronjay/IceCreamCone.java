package edu.sjsu.macaldo.aaronjay;

public class IceCreamCone {

    private double height;              //Private variable that holds the height
    private double radius;              //Private variable that holds the radius

    public IceCreamCone() {             //Default constructor that already gives non-zero values to the two variables
        height = 10.50;
        radius = 3.70;
    }

    //Non default constructor that would create an IceCreamCone based on arguments passed into it
    public IceCreamCone(double inputHeight, double inputRadius) {
        height = inputHeight;
        radius = inputRadius;
    }

    //Allows main to set height for an object
    public void setHeight(double inHeight) {
        if(inHeight >= 0)
            height = inHeight;
    }

    //Allows main to set radius for an object
    public void setRadius(double inRadius) {
        if(inRadius >= 0)
            radius = inRadius;
    }

    //Gets the height of the ice cream cone
    public double getHeight() {
        return height;
    }

    //Gets the radius of the ice cream cone
    public double getRadius() {
        return radius;
    }

    //Calculates the surface area based on the height and radius of the ice cream cone and returns result
    public double getSurfaceArea() {
        return Math.PI * radius * Math.sqrt(height * height + radius * radius);
    }

    //Calculates the volume based on the height and radius of the ice cream cone and returns result
    public double getVolume() {
        return Math.PI * radius * radius * height / 3;
    }

}
