import javax.swing.*;

public class Lab506 {

    public static boolean is_prime_number(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number;

        while (true) {
            number = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number (> 1):")
            );

            if (number > 1) {
                break;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Invalid number, please enter number greater than 1"
            );
        }

        if (is_prime_number(number)) {
            JOptionPane.showMessageDialog(
                    null,
                    number + " is Prime Number"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    number + " is Not Prime Number"
            );
        }
    }
}


