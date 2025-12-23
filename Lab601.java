import java.util.Scanner;
public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter positive integer number " + (i + 1) + " : ");
            int input = sc.nextInt();

            while (input <= 0) {
                System.out.print("Number must be positive. Enter number again: ");
                input = sc.nextInt();
            }

            numbers[i] = input;
        }


        System.out.print("\nEven numbers: ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int n : numbers) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
