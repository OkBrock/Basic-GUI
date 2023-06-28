import javax.swing.JOptionPane;

 /*
 * The "javax.swing" package is a part of the Java Standard Library
 * and provides classes and components for creating graphical user
 * interface (GUIs). Specifically, the "JOptionPane" class provides
 * a simply way to display dialog boxes and prompts to the user.
 */

public class IntroToGUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        // Builds a pane to input dialogue 

        JOptionPane.showMessageDialog(null, "Hello " + name);
        // Displays information


        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // The "showInputDialog" command returns a string
        // However, using the "Integar.parseInt" command, the string input is converted to an integer
        // Builds a pane to input dialogue

        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        // Displays information


        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in centimeters)"));
        // Returns double value
        // Builds a pane to input dialogue

        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
        // Displays information

    }
}
