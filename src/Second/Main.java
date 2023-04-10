package Second;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int n;
        double [] A;
        Scanner console = new Scanner (System.in);
        double r;
        try {
            System.out.println("Input r: ");
            r = console.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input r. Please enter a number.");
            return;
        }
        if(r <= 0) {
            System.out.println("Radius can't be <= 0! Please, enter real number. Aborting.");
            return;
        }
        System.out.print("Input N: ");
        n = console.nextInt();
        if(n <= 200 && n > 0) {
            A = new double[2*n];
            Random random = new Random();
            for (int i = 0; i < 2*n; i++) {
                A[i] = random.nextDouble(10);
            }
            System.out.println("All dots: ");
            for (int i = 0; i < 2*n; i+=2) {
                //System.out.printf("(" + A[i] + ", " + A[i+1] + ") ");
                System.out.printf("(%.2f, %.2f) ", A[i], A[i+1]);
            }
            System.out.println();
            System.out.println("All dots inside circle with radius " + r);
            for (int i = 0; i < 2*n; i+=2) {
                double distance = Math.sqrt(Math.pow(A[i], 2) + Math.pow(A[i+1], 2));
                if (distance <= r) {
                   // System.out.print("(" + A[i] + ", " + A[i+1] + ") ");
                    System.out.printf("(%.2f, %.2f) ", A[i], A[i+1]);
                }
            }
            System.out.println();
        } else {
            System.out.println("Wrong number N (must be 0 < N <= 200)! Aborting.");
            return;
        }

    }
}
