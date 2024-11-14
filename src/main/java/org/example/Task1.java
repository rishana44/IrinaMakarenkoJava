
import java.util.Scanner;
//Task1: Make up an algorithm. If the entered number is greater than 7, then print “Hello”
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        }
        scanner.close();
    }
}
