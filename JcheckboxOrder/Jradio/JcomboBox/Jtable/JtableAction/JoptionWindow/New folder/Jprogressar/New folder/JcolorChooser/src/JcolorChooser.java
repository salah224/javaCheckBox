//https://www.javatpoint.com/java-jcolorchooser
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JcolorChooser extends JFrame implements ActionListener{
	JButton b;
	Container c;
	JcolorChooser(){
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton("Click to see the Color selector");
		b.addActionListener(this);
		c.add(b);
	}
	public void actionPerformed(ActionEvent e){
		Color r = Color.RED;
		Color color = JColorChooser.showDialog(this, "Select color",r);
		c.setBackground(color);
	}
	public static void main(String[] args) {
		JcolorChooser ch = new JcolorChooser();
		ch.setSize(400,400);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
