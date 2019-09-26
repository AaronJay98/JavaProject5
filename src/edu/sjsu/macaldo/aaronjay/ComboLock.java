package edu.sjsu.macaldo.aaronjay;

import java.util.Arrays;

public class ComboLock {
    private int arrKey[] = new int[3];
    private int arrEntry[] = new int [arrKey.length];
    private boolean[] arrIsRightKey = {true, false, true};
    private boolean[] arrIsRightEntry = new boolean[arrEntry.length];
    private int dial = 0;

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

    public void reset() {
        dial = 0;
        Arrays.fill(arrEntry, -1);
    }

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

        if (arrEntry[0] == -2 && arrEntry[1] == -2 && arrEntry[2] == -2) {
            System.out.println("Combination invalid. Must reset dial to try again");
        }
    }

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

        if (arrEntry[0] == -2 && arrEntry[1] == -2 && arrEntry[2] == -2) {
            System.out.println("Combination invalid. Must reset dial to try again");
        }
    }

    public boolean open() {
        if(Arrays.equals(arrEntry, arrKey) && Arrays.equals(arrIsRightEntry, arrIsRightKey)) {
            return true;
        }
        return false;
    }

}
