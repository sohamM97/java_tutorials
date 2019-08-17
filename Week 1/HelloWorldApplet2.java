import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet2 extends Applet{

	public void paint(Graphics g){
		g.drawString("Hello World",25,50);
	}
}

//following were added to run directly from appletviewer

/*
<applet code="HelloWorldApplet2.class" width="320" height="120">		
</applet>
*/