import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integen number : ");
        int num = sc.nextInt();
        String EvenOdd = (num % 2 == 0) ? " Even" : " Odd";
        String PositiveAndNegative;
        if (num < 0){
            PositiveAndNegative = " Negative number";
        }
        else if (num > 0){
            PositiveAndNegative = " Positive number";
        }
        else{
            PositiveAndNegative = " Zero";
        }
        System.out.println("This number is" + EvenOdd + " and" + PositiveAndNegative + ".");

    }
}
