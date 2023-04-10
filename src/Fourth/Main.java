package Fourth;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = con.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        int biggestLength = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > biggestLength)
                biggestLength = words[i].length();
        }

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != biggestLength) {
                System.out.println(words[i] + " ");
            }
        }
        System.out.println();

    }
}
