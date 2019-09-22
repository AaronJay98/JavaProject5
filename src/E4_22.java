import java.util.Arrays;
import java.util.Scanner;

public class E4_22 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        IceCreamCone usersCone;
        double height;
        double radius;
        System.out.println("Welcome to my program that creates an ice cream cone and returns the surface area and volume of it.");
        System.out.println("Please enter the height :");
        height = userInput.nextDouble();
        System.out.println("Please enter the radius :");
        radius = userInput.nextDouble();

        usersCone = new IceCreamCone(height, radius);

        System.out.println("The Surface Area of your cone is : " + usersCone.getSurfaceArea());
        System.out.println("The Volume of your cone is : " + usersCone.getVolume());
    }
}
