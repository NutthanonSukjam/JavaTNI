import javax.swing.*;
import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X-axis value : ");
        int x = sc.nextInt();

        System.out.print("Enter Y-axis value : ");
        int y = sc.nextInt();

         String position = "";

         if (x == 0 && y == 0)
         {
             position = "Origin";
         }
         else if (x > 0 && y > 0 )
         {
             position = "First quadrant";
         }
         else if (x < 0 && y > 0 )
         {
             position = "Second quadrant";
         }
         else if (x < 0 && y < 0 )
         {
             position = "Third quadrant";
         }
         else if (x > 0 && y < 0 )
         {
             position = "Fourth quadrant";
         }
         System.out.println("The coordinate point (" + x + "," + y + ") lies in the " + position);
    }
}
