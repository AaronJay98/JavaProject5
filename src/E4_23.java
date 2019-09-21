import java.util.Scanner;

public class E4_23 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SodaCan usersCan;
        double height;
        double diameter;
        System.out.println("Welcome to my program that creates an ice cream cone and returns the surface area and volume of it.");
        System.out.println("Please enter the height :");
        height = userInput.nextDouble();
        System.out.println("Please enter the diameter :");
        diameter = userInput.nextDouble();

        usersCan = new SodaCan(height, diameter);

        System.out.println("The Surface Area of your can is : " + usersCan.getSurfaceArea());
        System.out.println("The Volume of your can is : " + usersCan.getVolume());
    }
}
