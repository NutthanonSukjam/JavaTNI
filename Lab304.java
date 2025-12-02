import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("##.00");
        String YourWeight = JOptionPane.showInputDialog("Enter your weight (kg.) : ");
        String YourHeight = JOptionPane.showInputDialog("Enter your height (cm.) : ");
        Double weight = Double.parseDouble(YourWeight);
        Double height = Double.parseDouble(YourHeight);
        Double NextheHeight = height/100;
        Double LastHeight = NextheHeight*NextheHeight;
        Double BMI = weight/LastHeight;
        String BODY = "";
        if (BMI < 18.5){
            BODY = "Underweight";
        }
        else if (BMI > 18.5 && BMI < 24.9){
            BODY = "Healthy weight";
        }
        else if (BMI < 25 && BMI < 29.9){
            BODY = "Overweight";
        }
        else
            BODY = "Obese";
        JOptionPane.showMessageDialog(null,"Your BMI is " + format.format(BMI) + "\nBMI result is " + BODY);

    }
}
