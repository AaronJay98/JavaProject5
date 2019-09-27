package edu.sjsu.macaldo.aaronjay;

public class SodaCan {
    private double height;              //Private variable that holds the height of the soda can
    private double diameter;            //Private variable that holds the diameter of the soda can

    //Non-default SodaCan constructor that takes in the height and diameter of the soda can as arguments and initializes them in private variables
    public SodaCan(double inputHeight, double inputDiameter) {
        height = inputHeight;
        diameter = inputDiameter;
    }

    //Gets the height of the soda can
    public double getHeight() {
        return height;
    }

    //Gets the diameter of the soda can
    public double getDiameter() {
        return diameter;
    }

    //Allows main to set the value of height
    public void setHeight(double inHeight) {
        if(inHeight >= 0)
            height = inHeight;
    }

    //Allows main to set balue of diameter
    public void setDiameter(double inDiameter) {
        if(inDiameter >= 0)
            diameter = inDiameter;
    }

    //Calculates the surface area of the soda can and returns the result
    public double getSurfaceArea() {
        return Math.PI * diameter * height + Math.PI * diameter * diameter / 2 ;
    }

    //Calculates the volume of the soda can and returns the result
    public double getVolume() {
        return Math.PI * diameter * diameter * height / 4;
    }


}
