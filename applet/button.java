import java.applet.*;
import java.awt.*;

/* <applet code="YourApplet" width="200" height="100"> 
	</applet> */
	
class Yourapplet extends Applet
{
	Button b1=new Button("Submit");
	Button b2=new Button("Play");
	Button b3=new Button("Stop");
	Button b4=new Button("Reset");
	
	public void init()
	{
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}

