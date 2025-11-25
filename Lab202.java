import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("");

        System.out.print("Enter number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n");
        int Summation = number1+number2;
        int Subtraction = number1-number2;
        int Multiplication = number1*number2;
        float Division = number1/Float.parseFloat(number2+"");
        int Modulus = number1%number2;

        System.out.println("Summation = " + Summation + "\nSubtraction = " + Subtraction + "\nMultiplication = " + Multiplication
        + "\nDivision = " + (Division) + "\nModulus = " + Modulus);
    }
}
