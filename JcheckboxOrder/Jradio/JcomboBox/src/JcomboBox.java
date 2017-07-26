//https://www.javatpoint.com/java-jcombobox
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JcomboBox {
JFrame f;
JLabel l, l1;
JcomboBox(){
	f = new JFrame("comboBox");
	String country[] = {"usa", "india", "germany", "england", "canda"};
	String num[] ={"01", "05", "013", "025", "008"};
	JComboBox c = new JComboBox(country);
	JComboBox c1 = new JComboBox(num);
	c.setBounds(200, 100,100,30);
	c1.setBounds(200, 150,100,30);
	
	l = new JLabel("country is ");
	l.setHorizontalAlignment(JLabel.CENTER);
	l.setSize(200,230);
	
	l1 = new JLabel("country code");
	l1.setHorizontalAlignment(JLabel.CENTER);
	l1.setSize(200,330);
	
	JButton b = new JButton("show");
	b.setBounds(150,200,75,20);
	
	f.add(c);
	f.add(c1);
	f.add(l);
	f.add(l1);
	f.add(b);
	
	
	f.setSize(400,500);
	f.setLayout(null);
	f.setVisible(true);
	
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			String data = "country is : "
					+ c.getItemAt(c.getSelectedIndex());
			l.setText(data);
		}
	});
	//
	b.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		
		String num = "country code is  : "
				+ c1.getItemAt(c1.getSelectedIndex());
		l1.setText(num);
	}
});
	
}
public static void main(String[] args) {
	new JcomboBox();
}
}
