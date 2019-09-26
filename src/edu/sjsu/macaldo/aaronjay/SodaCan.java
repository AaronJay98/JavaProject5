package edu.sjsu.macaldo.aaronjay;

public class SodaCan {
    private double height;
    private double diameter;

    public SodaCan(double inputHeight, double inputDiameter) {
        height = inputHeight;
        diameter = inputDiameter;
    }

    public double getHeight() {
        return height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setHeight(double inHeight) {
        if(inHeight >= 0)
            height = inHeight;
    }

    public void setDiameter(double inDiameter) {
        if(inDiameter >= 0)
            diameter = inDiameter;
    }

    public double getSurfaceArea() {
        return Math.PI * diameter * height + Math.PI * diameter * diameter / 2 ;
    }

    public double getVolume() {
        return Math.PI * diameter * diameter * height / 4;
    }


}
