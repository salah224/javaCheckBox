//https://www.javatpoint.com/java-jcolorchooser
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JcolorChooser2 extends JFrame implements ActionListener {
	JFrame f;
	JButton b;
	JTextArea t;
	JcolorChooser2(){
		f = new JFrame("Color chooser");
		b = new JButton("click here to see the color chooser");
		b.setBounds(100,250,100,30);
		 
		 t = new JTextArea();
		 t.setBounds(10,10,300,200);
		 
		 b.addActionListener(this);
		  
		 f.add(b);
		 f.add(t);
		 
		 f.setSize(400,400);
		 f.setLayout(null);
		 f.setVisible(true);
		 
	}
	public void actionPerformed(ActionEvent e){
		Color c = JColorChooser.showDialog(this,"chooser",Color.CYAN);
		t.setBackground(c);
	}
	public static void main(String[] args) {
		new JcolorChooser2();
	}
	

}
