import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class HelloWorldApplet extends Applet{

	public void init(){
		resize(300,300);
		setBackground(Color.RED);
	}

	public void paint(Graphics g){
		g.drawString("Welcome NPTEL Java!",150,150);
		g.drawString("Kharagpur",50,20);

	}
}