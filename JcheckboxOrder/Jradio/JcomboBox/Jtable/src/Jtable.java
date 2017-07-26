//https://www.javatpoint.com/java-jtable
import javax.swing.*;
public class Jtable {
	JFrame f;
	Jtable(){
		f = new JFrame();
		String data [][]={{"0340","jinna", "60000"},{"0341","Dan","6000"},
				{"0342","bill","102000"},{"0343", "dj", "35000"}};
		String column[]={"ID", "NAME", "SALARY"};
		
		JTable t = new JTable(data,column);
		
		
		t.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(t);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Jtable();
	}

}
