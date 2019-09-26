import edu.sjsu.macaldo.aaronjay.ComboLock;

import java.util.Scanner;

public class ComboLockTester {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int key1, key2, key3;
        char direction = ' ';           //l = turn dial left and r = turn dial right
        boolean isUnlocked = false;
        ComboLock usersLock;

        System.out.println("Welcome to my program that acts as a combination lock at a gym locker. You will create a 3 number lock combination (0-39) then open it.");

        System.out.println("Please enter your first key number (0-39) :");
        key1 = userInput.nextInt();
        System.out.println("Please enter your second key number (0-39) :");
        key2 = userInput.nextInt();
        System.out.println("Please enter your third key number (0-39) :");
        key3 = userInput.nextInt();

        usersLock = new ComboLock(key1, key2, key3);

        System.out.println("Time to try unlocking you lock. In order to unlock it you must turn right to your first entered key, " +
                "then left to your second key, and finally right to you third key\n");


        while(isUnlocked != true) {
            System.out.println("Enter a character ('l' to turn dial left; 'r' to turn right; 'o' to try to open lock; 'x' to reset the dial to 0 : ");
            direction = userInput.next().charAt(0);

            switch(direction) {
                case('l'):
                    System.out.println("Enter number of ticks to turn left: ");
                    usersLock.turnLeft(userInput.nextInt());
                    break;
                case('r'):
                    System.out.println("Enter number of ticks to turn right: ");
                    usersLock.turnRight(userInput.nextInt());
                    break;
                case('o'):
                    if(usersLock.open()) {
                        System.out.println("Unlocking was Successful!");
                        isUnlocked = true;
                    }
                    else
                        System.out.println("Unlocking was Unsuccessful!");
                    break;
                case('x'):
                    usersLock.reset();
                    break;
                default:
                    System.out.println("Unknown error has occurred");
            }
        }






    }

}
