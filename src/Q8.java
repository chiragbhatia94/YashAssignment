import java.util.*;

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

public class Q8 {
    static double length;
    static double width;
    static double height;
    static double area;
    static double cost;

    public static void findAreaAndCost(double costPerSquaredUnit) throws CustomException {

        getData();

        area = (length * height * 2) + (height * width * 2);

        cost = costPerSquaredUnit * area;

        System.out.println("Area : " + area);
        System.out.println("Cost : " + cost);
    }

    public static void getData() throws CustomException {

        Scanner input = new Scanner(System.in);
        double inputNumber;

        System.out.print("Enter Length : ");
        inputNumber = input.nextDouble();
        length = inputNumber;

        System.out.print("Enter Width : ");
        inputNumber = input.nextDouble();
        width = inputNumber;

        System.out.print("Enter Height : ");
        inputNumber = input.nextDouble();
        height = inputNumber;

        // If input is invalid
        if ((length < 1.0) || (width < 1.0) || (height < 1.0)) {
            input.close();
            throw new CustomException("Input cannot be less than 1!");
        }

        input.close();

    }

    public static void main(String[] args) {
        try {
            findAreaAndCost(4.5);
        } catch (CustomException exception) {
            System.out.println("Exception occurred! Message : " + exception.getMessage());
        }
    }
}
