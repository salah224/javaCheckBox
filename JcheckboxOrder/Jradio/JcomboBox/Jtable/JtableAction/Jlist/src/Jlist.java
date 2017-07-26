//https://www.javatpoint.com/java-jlist
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Jlist {
	Jlist(){
		JFrame f = new JFrame();
		JButton b = new JButton("show");
		b.setBounds(200,150,80,30);
		
		JLabel L = new JLabel();
		L.setSize(500,100);
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Item 1");
		l1.addElement("Item 2");
		l1.addElement("Item 3");
		l1.addElement("Itme 4");
		l1.addElement("Item 5");
		l1.addElement("Item 6");
		l1.addElement("Item 7");
		l1.addElement("Itme 8");
		JList <String> list = new JList<>(l1);
		list.setBounds(100, 100, 75,145);
		f.add(list);
		f.add(list);
		f.add(b);
		f.add(L);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String data = "";
				if(list.getSelectedIndex()!=-1){
					data = "list Items" + list.getSelectedValue();
					L.setText(data);
					
				}
				}
		});
		
		
	}
	public static void main(String[] args) {
		new Jlist();
	}
	
	

}
