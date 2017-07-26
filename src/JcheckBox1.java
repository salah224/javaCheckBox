//https://www.javatpoint.com/java-jcheckbox
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class JcheckBox1 {
	JcheckBox1(){
		JFrame f = new JFrame("check box");
		final JLabel label = new JLabel();
		JCheckBox b = new JCheckBox("male");
		b.setBounds(150,100,50,50);
		
		JCheckBox b2 = new JCheckBox("femal");
		b2.setBounds(150, 150,50,50);
		
		f.add(b);
		f.add(b2);
		f.add(label);
		
		b.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				label.setText("male " + (e.getStateChange()==1?"checked": "unchecked"));
			}
		});
		
		b2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				label.setText("femal " + (e.getStateChange()==1?"checked": "unchecked"));
			}
		});
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
	}
	public static void main(String[] args) {
		new JcheckBox1();
	}
	

}
