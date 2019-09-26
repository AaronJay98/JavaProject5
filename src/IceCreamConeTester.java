import edu.sjsu.macaldo.aaronjay.IceCreamCone;


public class IceCreamConeTester {

    public static void main(String[] args) {

        IceCreamCone usersCone = new IceCreamCone();
        System.out.println("Welcome to my program that creates an ice cream cone and returns the surface area and volume of it.");
        System.out.println("Height of cone: " + usersCone.getHeight());
        System.out.println("Radius of cone: " + usersCone.getRadius());
        System.out.println("The Surface Area of your cone is : " + usersCone.getSurfaceArea());
        System.out.println("The Volume of your cone is : " + usersCone.getVolume());

        /*                                              //This is main to test for user input constructor
        Scanner userInput = new Scanner(System.in);
        edu.sjsu.macaldo.aaronjay.IceCreamCone usersCone;
        double height;
        double radius;
        System.out.println("Welcome to my program that creates an ice cream cone and returns the surface area and volume of it.");
        System.out.println("Please enter the height :");
        height = userInput.nextDouble();
        System.out.println("Please enter the radius :");
        radius = userInput.nextDouble();

        usersCone = new edu.sjsu.macaldo.aaronjay.IceCreamCone(height, radius);

        System.out.println("The Surface Area of your cone is : " + usersCone.getSurfaceArea());
        System.out.println("The Volume of your cone is : " + usersCone.getVolume());
        */
    }
}
