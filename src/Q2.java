import java.util.Scanner;

public class Q2 {
    public static double[] getWeight(double[][] students) {
        double[] weight = null;

        if (null != students) {

            double maxWeight = 0;
            double minWeight = students[0][0];

            for (double[] array : students) {
                if (array[0] > maxWeight)
                    maxWeight = array[0];

                if (array[0] < minWeight) {
                    minWeight = array[0];
                }
            }

            weight = new double[] { maxWeight, minWeight };
        }

        return weight;
    };

    public static double[] getHeight(double[][] students) {
        double[] height = null;

        if (null != students) {

            double maxHeight = 0;
            double minHeight = students[0][1];

            for (double[] array : students) {
                if (array[1] > maxHeight)
                    maxHeight = array[1];

                if (array[1] < minHeight) {
                    minHeight = array[1];
                }
            }

            height = new double[] { maxHeight, minHeight };
        }

        return height;
    };

    public static double[][] getData() {
        double[][] students = new double[3][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data now : ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter height (student " + (i + 1) + ") : ");
            students[i][0] = sc.nextDouble();

            System.out.println("Enter weight (student " + (i + 1) + ") : ");
            students[i][1] = sc.nextDouble();
        }

        //sc.close();

        return students;

    }

    public static void main(String[] args) {

        double[][] students = getData();

        double[] weightResult = getWeight(students);
        double[] heightResult = getHeight(students);

        if (null != students) {

            System.out.println("Min. Weight : " + weightResult[1] + " Max. Weight : " + weightResult[0]);
            System.out.println("Min. Height : " + heightResult[1] + " Max. Height : " + heightResult[0]);
        }

    }

}
