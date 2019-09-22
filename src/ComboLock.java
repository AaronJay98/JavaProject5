import java.util.Arrays;

public class ComboLock {
    private int arrKey[] = new int[3];
    private int arrEntry[] = new int [arrKey.length];
    private boolean[] arrIsRightKey = {true, false, true};
    private boolean[] arrIsRightEntry = new boolean[arrEntry.length];

    int dial = 0;

    public ComboLock(int secret1, int secret2, int secret3) {
        arrKey[0] = secret1;
        arrKey[1] = secret2;
        arrKey[2] = secret3;
        Arrays.fill(arrEntry, -1);
    }

/*                                                              Constructor for when i want to use lock for more than just 3 combination lock
    public ComboLock(int... keys) {                             //Needs to use a dynamic array for all 4 arrays
        for(int i = 0; i < keys.length; i++) {                  //Need to create alternating for loop for isRightKey array
            arrKey[i] = keys[i];
        }
        Arrays.fill(arrEntry, -1);
    }
*/

    public void reset() {
        dial = 0;
    }

    public void turnLeft(int ticks) {
        dial -= ticks;
        while(dial < 0)
            dial += 40;

        if(arrEntry[0] == -1) {
            arrEntry[0] = dial;
            arrIsRightEntry[0] = false;
        }
        else if(arrEntry[1] == -1) {
            arrEntry[1] = dial;
            arrIsRightEntry[1] = false;
        }
        else if(arrEntry[2] == -1) {
            arrEntry[2] = dial;
            arrIsRightEntry[2] = false;
        }
        else {
            for(int i = 0; i < 2; i++) {
                arrEntry[i] = arrEntry[i+1];
                arrIsRightEntry[i] = arrIsRightEntry[i+1];
            }
            arrEntry[2] = dial;
            arrIsRightEntry[2] = false;
        }
    }

    public void turnRight (int ticks) {
        dial += ticks;
        while(dial > 39)
            dial -= 40;

        if(arrEntry[0] == -1) {
            arrEntry[0] = dial;
            arrIsRightEntry[0] = true;
        }
        else if(arrEntry[1] == -1) {
            arrEntry[1] = dial;
            arrIsRightEntry[1] = true;
        }
        else if(arrEntry[2] == -1) {
            arrEntry[2] = dial;
            arrIsRightEntry[2] = true;
        }
        else {
            for(int i = 0; i < arrEntry.length - 1; i++) {
                arrEntry[i] = arrEntry[i+1];
                arrIsRightEntry[i] = arrIsRightEntry[i+1];
            }
            arrEntry[2] = dial;
            arrIsRightEntry[2] = true;
        }
    }

    public boolean open() {
        if(Arrays.equals(arrEntry, arrKey) && Arrays.equals(arrIsRightEntry, arrIsRightKey)) {
            return true;

        }
        return false;
    }

}
