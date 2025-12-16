import java.util.Scanner;

public class Lab504 {

    public static boolean check_password(String pass) {
        return pass.length() > 8;
    }

    public static boolean check_password(String pass, String confirm_pass) {
        return pass.equals(confirm_pass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        String confirm;

        while (true) {
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (check_password(password)) break;
            System.out.print("Invalid! password create password :");
        }

        while (true) {
            System.out.print("Enter Confirm Password: ");
            confirm = sc.nextLine();

            if (check_password(password, confirm)) break;
            System.out.print("Password not match, try again : ");
        }

        System.out.println("Password set successfully!!");
    }
}
