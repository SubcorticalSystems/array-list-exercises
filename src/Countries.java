import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        //initialized array for countries
        String[] countryArray = {"China","Morocco",
                "Norway", "Japan", "Spain", "France", "Finland",
                "United States", "South Korea", "Brazil", "Poland", "Germany"};
        System.out.println("Unsorted Country List: " + Arrays.toString(countryArray));
        //sort countries array alphabetically
        Arrays.sort(countryArray);
        System.out.println("Sorted Country List: " + Arrays.toString(countryArray));
    }
}
