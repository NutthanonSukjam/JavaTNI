import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int max = 0, Min = 0;
        System.out.print("How many number to input : ");
        int manynumber = scanner.nextInt();
        for (int i = 1; i<= manynumber; i++)
        {
            System.out.print("Enter number " + i + ":");
            number = scanner.nextInt();
            if(number > max){
                max = number;
            }
            if (i==1)Min=max;
            if (number < Min){
                Min = number;
            }
            String EvenOdd = "";
        }
        String EvenOdd = "";
        if (number % 2 == 0){
            EvenOdd = "Even";
        }
        else{
            EvenOdd = "Odd";
        }
        System.out.println("Maximum = " + max + "\n<inMinimum = " + Min);
        System.out.println("Even number = " + EvenOdd + "\n Odd number" + EvenOdd);
    }
}
