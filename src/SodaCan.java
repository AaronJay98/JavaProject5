public class SodaCan {
    public SodaCan(double inputHeight, double inputDiameter) {
        height = inputHeight;
        diameter = inputDiameter;
    }

    double getSurfaceArea() {
        return Math.PI * diameter * height + Math.PI * diameter * diameter / 2 ;
    }

    double getVolume() {
        return Math.PI * diameter * diameter * height / 4;
    }

    double height;
    double diameter;
}
