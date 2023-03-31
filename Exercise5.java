import java.text.DecimalFormat;

import javax.swing.*;

public class Exercise5 {
    public static void main(String[] args) {
        int choice;
        choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose What Would you like to Calculate the Area of(1-4): \n1. Circle\n2. Rectangle\n3. Triangle\n4. Quit the Program"));
        switch (choice) {
            case 1:
                Circle();
                break;

            case 2:
                Rectangle();
                break;
            case 3:
                Triangle();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Exiting Program");
        }

    }// end main

    public static void Circle() {
        int r;
        r = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Radius of the Circle"));
        DecimalFormat df = new DecimalFormat("##.##");
        String formatted = df.format(Math.PI * r * 2);
        JOptionPane.showMessageDialog(null,
                "The area of a circle with the radius of " + r + " is: " + formatted);
    }

    public static void Rectangle() {
        int Length, Width;
        Length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Length of the Rectangle"));
        Width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Width of the Rectangle"));
        JOptionPane.showMessageDialog(null,
                "The area of a rectangle with the length of " + Length + " and the width of " + Width + " is: "
                        + Length * Width);
    }

    public static void Triangle() {
        int Base, Height;
        Base = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Base of the Triangle"));
        Height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Height of the Triangle"));
        JOptionPane.showMessageDialog(null,
                "The area of a triangle with the base of " + Base + " and height of " + Height + " is: "
                        + Base * Height * 0.5);
    }
}
