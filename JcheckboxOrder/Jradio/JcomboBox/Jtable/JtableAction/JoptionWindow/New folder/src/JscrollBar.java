//https://www.javatpoint.com/java-jscrollbar
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
public class JscrollBar {
	
	JscrollBar(){
		JFrame f = new JFrame("JscrollBar");
		final JScrollBar bar = new JScrollBar();
		bar.setBounds(100, 100,150,150);
		
		final JLabel l = new JLabel();
		l.setHorizontalAlignment(JLabel.CENTER);
		f.add(l);
		l.setSize(400,100);
		
		f.add(bar);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		bar.addAdjustmentListener(new AdjustmentListener(){
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				l.setText("Vertical scroll value " + bar.getValue());
				
			}

			
			
		});
		
		
	}
	public static void main(String[] args) {
		new JscrollBar();
	}
}
