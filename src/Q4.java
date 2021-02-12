import java.util.*;

public class Q4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;


        String[] names = new String[5];

        System.out.println("Enter 5 names : ");
        for (int i = 0; i < names.length; i++) {
            input = sc.nextLine();
            names[i] = input;

        }

        System.out.print("Enter a name : ");
        sc = new Scanner(System.in);
        input = sc.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(input)) {
                System.out.println(input + " found!");
                break;
            }
        }

    }

}
