package Third;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N;
        N = con.nextInt();
        if(N < 0 || N >= 15) {
            System.out.println("N must be 0 < N <= 15. Aborting");
            return;
        }
        int[][] A = new int[N][N];
        boolean[] L = new boolean[N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                Random random = new Random();
                A[i][j] = random.nextInt(21) - 10; // range [-10, 10]
            }
        }
        System.out.println("Generated matrix:");
        for(int i = 0; i < N; i++) {
            int pos = 0, neg = 0;
            for(int j = 0; j < N; j++) {
                System.out.printf("%4d", A[i][j]);
                if(A[i][j] > 0) pos++;
                else if(A[i][j] < 0) neg++;
            }
            if(neg > pos) {
                L[i] = true;
            } else {
                L[i] = false;
            }
            System.out.println();
        }

        System.out.println("Result L:");
        for(int i = 0; i < N; i++) {
            System.out.print(L[i] + " ");
        }
        System.out.println();
    }
}
