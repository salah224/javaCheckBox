//https://www.javatpoint.com/java-joptionpane
import javax.swing.*;
public class JoptionShowInput {
JFrame f;
JoptionShowInput(){
	String name = JOptionPane.showInputDialog("Enter name");
}
public static void main(String[] args) {
	new JoptionShowInput();
}
}
