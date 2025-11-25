import javax.swing.*;
import java.text.DecimalFormat;

public class Lab208 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("00");
        final int pricehour = 50;
        final double priceminute = 0.25;
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Input start time (hour) : "));
        int minute = Integer.parseInt(JOptionPane.showInputDialog("Input start time (minute) : "));
        int hour_end = Integer.parseInt(JOptionPane.showInputDialog("Input end time (hour) : "));
        int minute_end = Integer.parseInt(JOptionPane.showInputDialog("Input end time (minute) : "));

        int hourandminute = (hour*60)+minute;
        int endhourandendminute = (hour_end*60)+minute_end;
        int hourwow = (endhourandendminute-hourandminute)/60;
        int minutewow = (endhourandendminute-hourandminute)%60;
        int totalprice = hourwow * pricehour;
        double total_minute_price = minutewow*priceminute;
        double totalOfanything = totalprice+total_minute_price;
        JOptionPane.showMessageDialog(null,"Start parking at " + hour + ":" + minute + "\nEnd parking at " + hour_end + ":" + frm.format(minute_end) +
        "\nTotal time is hour is " + hourwow + " hour " + minutewow + " minute" + "\nParking payment is " + totalOfanything + " baht");
     }
}
