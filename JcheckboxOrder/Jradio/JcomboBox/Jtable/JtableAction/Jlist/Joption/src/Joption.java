//https://www.javatpoint.com/java-joptionpane
import javax.swing.*;
public class Joption {
	JFrame f;
	Joption()
	{
		f = new JFrame();
		JOptionPane.showConfirmDialog(f, "java JOption Pane Show message dialog");
		
	}
	public static void main(String[] args) {
		new Joption();
	}

}
