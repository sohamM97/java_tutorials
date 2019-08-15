import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet{

	public void init(){
		resize(200,200);
	}

	public void paint(Graphics g){
		g.drawString("Hello World!",150,150);
	}
}