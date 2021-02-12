import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        String[] nameStrings = new String[4];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nameStrings.length; i++) {
            nameStrings[i] = input.nextLine();
        }

        // Sort the names array
        Arrays.sort(nameStrings);

        // Print the names
        for (int i = 0; i < nameStrings.length; i++) {
            System.out.println(nameStrings[i]);
        }

        input.close();
    }

}
