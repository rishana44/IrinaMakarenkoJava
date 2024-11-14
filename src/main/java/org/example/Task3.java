import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Task3 Make up an algorithm.There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements size:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> multiplesOfThree = new ArrayList<>();

        for (int num : array) {

            if (num % 3 == 0) {

                multiplesOfThree.add(num);
            }
        }

        System.out.println("Array elements that are multiples 3:");
        for (int multiple : multiplesOfThree) {
            System.out.print(multiple + " ");
        }

        scanner.close();
    }
}
