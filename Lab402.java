import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {

        String id;

        while (true) {
            id = JOptionPane.showInputDialog("Enter Student ID:");

            if (id == null) System.exit(0);

            if (id.length() != 10) {
                continue;
            }
            break;
        }

        String major = id.substring(2, 5);

        switch (major) {
            case "131":
                JOptionPane.showMessageDialog(null, "Information Technology (IT)");
                break;
            case "132":
                JOptionPane.showMessageDialog(null, "Multimedia Technology (MT)");
                break;
            case "133":
                JOptionPane.showMessageDialog(null, "Digital Business Information Technology (BI)");
                break;
            case "134":
                JOptionPane.showMessageDialog(null, "Digital Technology in Mass Communication (DC)");
                break;
            case "135":
                JOptionPane.showMessageDialog(null, "Data Science and Data Analytics (DS)");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Cannot found major");
        }
    }
}
