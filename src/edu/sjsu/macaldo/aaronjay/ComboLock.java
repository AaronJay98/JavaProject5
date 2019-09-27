package edu.sjsu.macaldo.aaronjay;

import java.util.Arrays;

public class ComboLock {
    private int arrKey[] = new int[3];                                  //Array that holds the keys
    private int arrEntry[] = new int [arrKey.length];                   //Array that holds the userInputs to unlock lock
    private boolean[] arrIsRightKey = {true, false, true};              //Array of boolean telling which direction dial is to be turned
    private boolean[] arrIsRightEntry = new boolean[arrEntry.length];   //Array of boolean telling which direction user turns dial
    private int dial = 0;                                               //The dial of a lock

    //Creates the lock with userInputed keys that will be used to unlock it and puts them into appropriate variables. Aso initialize the arrEntry to be ready to receive users attempt to unlock lock
    public ComboLock(int secret1, int secret2, int secret3) {
        arrKey[0] = secret1;
        arrKey[1] = secret2;
        arrKey[2] = secret3;
        Arrays.fill(arrEntry, -1);
    }

/*                                                              Constructor for when i want to use lock for more than just 3 combination lock
    public edu.sjsu.macaldo.aaronjay.ComboLock(int... keys) {                             //Needs to use a dynamic array for all 4 arrays
        for(int i = 0; i < keys.length; i++) {                  //Need to create alternating for loop for isRightKey array
            arrKey[i] = keys[i];
        }
        Arrays.fill(arrEntry, -1);
    }
*/
    //Will reset dial to 0 and reset the arrEntry to receive new arguments to unlock the lock
    public void reset() {
        dial = 0;
        Arrays.fill(arrEntry, -1);
        System.out.println("Dial is now at: " + dial);
    }

    //Physically turns the dial left thus increasing the number dial represents based on the number of ticks user inputs
    public void turnLeft(int ticks) {
        dial += ticks;
        while (dial > 39)
            dial -= 40;

        if(ticks > 39 || ticks < 0) {
            Arrays.fill(arrEntry, -2);
            Arrays.fill(arrIsRightEntry, false);
        }
        else {
            if (arrEntry[0] == -1) {
                arrEntry[0] = dial;
                arrIsRightEntry[0] = false;
            } else if (arrEntry[1] == -1) {
                arrEntry[1] = dial;
                arrIsRightEntry[1] = false;
            } else if (arrEntry[2] == -1) {
                arrEntry[2] = dial;
                arrIsRightEntry[2] = false;
            } else {
                Arrays.fill(arrEntry, -2);
                Arrays.fill(arrIsRightEntry, false);
            }
        }

        System.out.println("Dial is now at: " + dial);

        if (arrEntry[0] == -2 && arrEntry[1] == -2 && arrEntry[2] == -2) {
            System.out.println("Combination invalid. Must reset dial to try again");
        }
    }

    //Physically turns the dial right thus decreasing the number dial represents based on the number of ticks user inputs
    public void turnRight (int ticks) {
        dial -= ticks;
        while(dial < 0)
            dial += 40;

        if(ticks > 39 || ticks < 0) {
            Arrays.fill(arrEntry, -2);
            Arrays.fill(arrIsRightEntry, false);
        }
        else {
            if (arrEntry[0] == -1) {
                arrEntry[0] = dial;
                arrIsRightEntry[0] = true;
            } else if (arrEntry[1] == -1) {
                arrEntry[1] = dial;
                arrIsRightEntry[1] = true;
            } else if (arrEntry[2] == -1) {
                arrEntry[2] = dial;
                arrIsRightEntry[2] = true;
            } else {
                Arrays.fill(arrEntry, -2);
                Arrays.fill(arrIsRightEntry, false);
            }
        }

        System.out.println("Dial is now at: " + dial);

        if (arrEntry[0] == -2 && arrEntry[1] == -2 && arrEntry[2] == -2) {
            System.out.println("Combination invalid. Must reset dial to try again");
        }
    }

    //Attempts to open the lock and only opens if inputs were same value as keys in same order and were reached through the correct direction
    public boolean open() {
        if(Arrays.equals(arrEntry, arrKey) && Arrays.equals(arrIsRightEntry, arrIsRightKey)) {
            System.out.println("Unlocking was Successful!");
            return true;
        }
        System.out.println("Unlocking was Unsuccessful! Must reset dial to try again");
        return false;
    }

}
