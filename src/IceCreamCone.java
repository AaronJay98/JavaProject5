public class IceCreamCone {
    public IceCreamCone(double inputHeight, double inputRadius) {
        height = inputHeight;
        radius = inputRadius;
    }

    double getSurfaceArea() {
        return Math.PI * radius * Math.sqrt(height * height + radius * radius);
    }

    double getVolume() {
        return Math.PI * radius * radius * height / 3;
    }

    double height;
    double radius;
}
