import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lower and upper bounds please.");
        int min = scanner.nextInt();
        int max = scanner.nextInt();


        Random rn = new Random();
        int answer = rn.nextInt(max - min + 1) + min;
        System.out.println(answer);
    }
}
