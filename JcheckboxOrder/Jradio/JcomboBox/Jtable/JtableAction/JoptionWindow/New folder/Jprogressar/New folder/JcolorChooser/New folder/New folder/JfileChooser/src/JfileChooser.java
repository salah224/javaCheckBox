//https://www.javatpoint.com/java-jfilechooser
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
public class JfileChooser extends JFrame implements ActionListener {
	JMenuBar m;
	JMenu file;
	JMenuItem open;
	
	JTextArea ta;
	JfileChooser(){
		open = new JMenuItem("Open File");
		open.addActionListener(this);
		
		file = new JMenu("File");
		file.add(open);
		
		m = new JMenuBar();
		m.setBounds(0, 0,800,20);
		m.add(file);
		ta = new JTextArea(800,800);
		ta.setBounds(0,20,800,800);
		add(m);
		add(ta);
	}
		public void actionPerformed(ActionEvent e){
			
		if(e.getSource()==open){
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION){
				File f = fc.getSelectedFile();
				String filepath = f.getPath();
				try{
					BufferedReader br = new BufferedReader(new FileReader(filepath));
					String s1 ="",s2="";
					while((s1=br.readLine())!=null){
						s2  += s1 +"\n";
					}
					ta.setText(s2);
					br.close();
					
				}catch(Exception ex){ex.printStackTrace();}
			}
	}
	
		}
		public static void main(String[] args) {
			 JfileChooser om = new  JfileChooser();
			 om.setSize(500,500);
			 om.setLayout(null);
			 om.setVisible(true);
			 om.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
		}
