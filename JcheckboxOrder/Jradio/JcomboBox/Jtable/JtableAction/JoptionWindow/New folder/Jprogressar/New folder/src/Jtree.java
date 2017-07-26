//https://www.javatpoint.com/java-jtree
import javax.swing.*;
import javax.swing.tree.AbstractLayoutCache;
import javax.swing.tree.DefaultMutableTreeNode;
public class Jtree {
	JFrame f;
	Jtree(){
		f = new JFrame();
		  DefaultMutableTreeNode  style = new   DefaultMutableTreeNode ("Style");
		  DefaultMutableTreeNode color = new  DefaultMutableTreeNode("color");
		  DefaultMutableTreeNode font = new  DefaultMutableTreeNode("Font");
		  
		  style.add(color);
		  style.add(font);
		  DefaultMutableTreeNode red = new  DefaultMutableTreeNode("Red");
		  DefaultMutableTreeNode blue = new  DefaultMutableTreeNode("lue");
		  DefaultMutableTreeNode black = new  DefaultMutableTreeNode("Blak");
		  DefaultMutableTreeNode green = new  DefaultMutableTreeNode("Green");
		  DefaultMutableTreeNode yellow = new  DefaultMutableTreeNode("Yellow");
		  DefaultMutableTreeNode white = new  DefaultMutableTreeNode("White");
		  color.add(red);
		  color.add(blue);
		  color.add(black);
		  color.add(green);
		  color.add(yellow);
		  color.add(white);
		  //
		 
		  DefaultMutableTreeNode time = new  DefaultMutableTreeNode("Time");
		  DefaultMutableTreeNode grsave = new  DefaultMutableTreeNode("Grsave");
		  DefaultMutableTreeNode lolo = new  DefaultMutableTreeNode("lolo");
		  DefaultMutableTreeNode flek = new  DefaultMutableTreeNode("Flek");
		  DefaultMutableTreeNode design = new  DefaultMutableTreeNode("Design");
		  DefaultMutableTreeNode cober = new  DefaultMutableTreeNode("cober");
		  color.add(red);
		  color.add(blue);
		  color.add(black);
		  color.add(green);
		  color.add(yellow);
		  color.add(white);
		  
		  font.add(time);
		  font.add(grsave);
		  font.add(lolo);
		  font.add(flek);
		  font.add(design);
		  font.add(cober);
		  
		  //
		  JTree t = new JTree(style);
		  f.add(t);
		  f.setSize(400,400);
		  f.setVisible(true);
	}
	public static void main(String[] args) {
		new Jtree();
	}

}
