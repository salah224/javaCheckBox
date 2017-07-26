package jSlider;
//https://www.javatpoint.com/java-jslider
import javax.swing.*;
public class jSlider extends JFrame{
	 jSlider(){
		 JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 30);  
		 slider.setMinorTickSpacing(2);  
		 slider.setMajorTickSpacing(10);  
		 slider.setPaintTicks(true);  
		 slider.setPaintLabels(true);  
		   
		 JPanel panel=new JPanel();  
		 panel.add(slider);  
		 add(panel);  
		 }  
		 public static void main(String s[]) {  
			 jSlider frame=new  jSlider();  
		 frame.pack();  
		 frame.setVisible(true);  
		 }  
		 }  