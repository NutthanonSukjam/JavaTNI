import javax.swing.JOptionPane;

public class Lab403 {
    public static void main(String[] args) {

        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        String username;
        String password;

        while (true) {
            username = JOptionPane.showInputDialog(null, "Enter username:");
            password = JOptionPane.showInputDialog(null, "Enter password:");

            if (username.equalsIgnoreCase(USERNAME) && password.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null,
                        "Login Success!!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login Fail...",
                        "Incorrect username or password",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

