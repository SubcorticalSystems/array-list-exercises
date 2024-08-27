import java.util.Random;
import java.util.Arrays;
public class randomNumberGenerator {
    public static void main(String[] args) {
        //Initialized array and filled with random numbers between 0-99
        int[] intArray = new Random().ints(20,0,100).toArray();
        System.out.println("Unsorted Array: " + Arrays.toString(intArray));
        //Sorts array values in ascending order
        Arrays.sort(intArray);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }
}
