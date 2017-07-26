//https://www.javatpoint.com/java-jprogressbar
import javax.swing.*;
public class Jprogressar extends JFrame {
   JProgressBar jb;
   int i=0;
   int num = 0;
   Jprogressar(){
	   jb = new JProgressBar(0,2000);
	   jb.setBounds(40,40,160,30);
	   jb.setValue(0);
	   jb.setStringPainted(true);
	   add(jb);
	   setSize(250,150);
	   setLayout(null);
   }
   public void rat(){
	   while(i<=2000){
		   jb.setValue(i);
		   i= i+ 20;
		   try{Thread.sleep(150);}catch(Exception e){}
	   }
	   //add messa.g3
	   
	   JOptionPane.showMessageDialog(jb,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
   }
   
   public static void main(String[] args) {

	   Jprogressar m = new Jprogressar();
	   m.setVisible(true);
	   m.rat();
}
}
