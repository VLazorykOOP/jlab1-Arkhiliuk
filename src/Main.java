import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner console = new Scanner (System.in);
        while(true) {
            Scanner console = new Scanner (System.in);
            System.out.println("1. Double");
            System.out.println("2. In int, Out - Double");
            System.out.println("3. In - double, out - int");
            System.out.println("4. Exit");
            System.out.println("Choose: ");
            int choose; //= console.nextInt();

            try{
                choose = console.nextInt();
            } catch(InputMismatchException e){
                continue;
            }

            switch (choose) {
                case 1 -> {
                    double x, y, result;
                    try {
                        System.out.println("Input x: ");
                        x = console.nextDouble();
                        System.out.println("Input y: ");
                        y = console.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }
                    if (x == 0 || y == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = 1/(x*y)+1/(Math.pow(x, 2)+Math.pow(y, 2))*(x-y);
                    System.out.printf("Result: %f\n", result);
                }
                case 2 -> {
                    int x, y;
                    double result;
                    try {
                        System.out.println("Input x: ");
                        x = console.nextInt();
                        System.out.println("Input y: ");
                        y = console.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }
                    if (x == 0 || y == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = 1.0/(x*y)+1/(Math.pow(x, 2)+Math.pow(y, 2))*(x-y);
                    System.out.printf("Result: %f\n", result);
                }
                case 3 -> {
                    double x, y;
                    int result;
                    try {
                        System.out.println("Input x: ");
                        x = console.nextDouble();
                        System.out.println("Input y: ");
                        y = console.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }
                    if (x == 0 || y == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = (int) (1/(x*y)+1/(Math.pow(x, 2)+Math.pow(y, 2))*(x-y));
                    System.out.printf("Result: %d\n", result);
                }
                case 4 -> {
                    System.out.println("ne");
                    return;
                }
                default -> System.out.println("Error.");
            }
        }

    }
}