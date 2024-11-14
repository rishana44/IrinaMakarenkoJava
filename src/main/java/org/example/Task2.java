import java.util.Scanner;
//Task1: Make up an algorithm. If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");

        String name = scanner.nextLine();

        if (name.equals("John")) {

            System.out.println("Hello, John");
        } else {

            System.out.println("There is no such name");
        }

        scanner.close();
    }
}
