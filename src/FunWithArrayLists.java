import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class FunWithArrayLists {
    public static void main(String[] args) {

        //Simple Integer Array
        int[] simpleIntArray = new Random().ints(20,0,100).toArray();
        System.out.println("Unsorted Simple Integer Array: " + Arrays.toString(simpleIntArray));
        Arrays.sort(simpleIntArray);
        System.out.println("Sorted Simple Integer  Array: " + Arrays.toString(simpleIntArray) + "\n");

        //Integer Array List
        ArrayList<Integer> intArrayList = new ArrayList<>();
        Random ran = new Random();
        int counter = 0;
        while(counter <= 20){
            int rng = ran.nextInt(100);
            intArrayList.add(rng);
            counter ++;
        }
        System.out.println("Unsorted Integer ArrayList: " + intArrayList);
        Collections.sort(intArrayList);
        System.out.println("Sorted Integer ArrayList: " + intArrayList);
        intArrayList.add(ran.nextInt(100));
        intArrayList.add(ran.nextInt(100));
        intArrayList.add(ran.nextInt(100));
        System.out.println("Integer ArrayList Appended: " + intArrayList);
        Collections.sort(intArrayList);
        System.out.println("Re-sorted Integer ArrayList: " + intArrayList + "\n");



        //Simple String Array
        String[] simpleCountryArray = {"China","Morocco", "Norway", "Japan", "Germany"};
        System.out.println("Unsorted Simple Country List: " + Arrays.toString(simpleCountryArray));
        Arrays.sort(simpleCountryArray);
        System.out.println("Sorted Simple Country List: " + Arrays.toString(simpleCountryArray) + "\n");

        //String Array List
        ArrayList<String> countriesArrayList = new ArrayList<>(Arrays.asList("China","Morocco",
                "Norway", "Japan", "Spain", "France", "Finland",
                "United States", "South Korea", "Brazil", "Poland", "Germany"));
        System.out.println("Unsorted Country ArrayList: " + countriesArrayList);
        Collections.sort(countriesArrayList);
        System.out.println("Sorted Country ArrayList: " + countriesArrayList);
        countriesArrayList.add("Canada");
        countriesArrayList.add("Columbia");
        countriesArrayList.add("Argentina");
        System.out.println("Country ArrayList Appended: " + countriesArrayList);
        Collections.sort(countriesArrayList);
        System.out.println("Re-sorted Country ArrayList: " + countriesArrayList);
    }
}
