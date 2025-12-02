import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name : ");
        String HeightInput = JOptionPane.showInputDialog("Enter your height(cm.) : ");
        int height = Integer.parseInt(HeightInput);

        int maleChoice = JOptionPane.showConfirmDialog(null,"Are your biological gender is Male","Gender",
        JOptionPane.YES_NO_OPTION);
        double stardardWeight;
        if (maleChoice == JOptionPane.YES_OPTION){
            stardardWeight = height-100;
           JOptionPane.showMessageDialog(null,"Hello.Mr " + name + "\n if Your height is "+HeightInput +" cm."
            +"\nYour Weight should be " + stardardWeight + " kg.");
        }
        int FemaleChoice = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Female","Gender",JOptionPane.YES_NO_OPTION);
        if (FemaleChoice == JOptionPane.YES_OPTION){
            stardardWeight = height-110;
            JOptionPane.showMessageDialog(null,"Hello.Ms " + name + "\n if Your height is " + HeightInput + " cm."
            + "\nYour Weight should be " + stardardWeight + " kg.");
        }
        else{
            JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight height.");
        }
    }
}
