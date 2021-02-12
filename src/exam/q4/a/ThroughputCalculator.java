package exam.q4.a;

import java.util.Scanner;

public class ThroughputCalculator {
    public static void main(String[] args) {
        try {
            final float w = 10f;
            System.out.println("Calculate the value of throughput for a channel bandwidth of " + w + " for user i:");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Φi: ");
            float phi = sc.nextFloat();
            if (phi < 0) {
                throw new CustomException("Φi cannot be less than 0.");
            }
            System.out.print("Enter Ti: ");
            float t = sc.nextFloat();
            if (t == 0) {
                throw new CustomException("Ti cannot be 0.");
            }
            float throughput = phi / (t * w);
            System.out.println("Throughput: " + throughput);
            sc.close();
        } catch (CustomException e) {
            System.err.println("Please try again with correct inputs");
        }
    }
}
