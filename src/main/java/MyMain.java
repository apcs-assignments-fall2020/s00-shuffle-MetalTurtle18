import java.util.ArrayList;
import java.util.Random;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) {
        ArrayList<Integer> outList = new ArrayList<>();
        int[] halfOne = new int[(int) (arr.length / 2)];
        int[] halfTwo = new int[(int) (arr.length / 2)];
        int j = arr.length / 2;
        for (int i = 0; i < arr.length / 2; i ++) {
            halfOne[i] = arr[i];
            halfTwo[i] = arr[j];
            j++;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            outList.add(halfOne[i]);
            outList.add(halfTwo[i]);
        }
        int[] outArray = new int[arr.length];
        for (int i = 0; i < outArray.length; i++) {
            outArray[i] = outList.get(i);
        }
        return outArray;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        Random rng = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rng.nextInt(arr.length);
            int switchingNumber = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = switchingNumber;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        for (int i : selectionShuffle(test)) {
            System.out.println(i);
        }
    }
}
