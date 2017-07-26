//https://www.javatpoint.com/java-joptionpane
import javax.swing.*;
import java.awt.event.*;
public class JoptionWindow extends WindowAdapter {
	JFrame f;
	JLabel l;
	JoptionWindow(){
		f = new JFrame();
		l = new JLabel("close the window");
		l.setBounds(60, 50, 100, 30);
		f.addWindowListener(this);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
public void windowClosing(WindowEvent e){
	int a =JOptionPane.showConfirmDialog(f, "are you sure");
	if(a==JOptionPane.YES_OPTION){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
public static void main(String[] args) {
	new JoptionWindow();
}

}
