// Assignment-4 (Program:-1)

import java.applet.*;
import java.awt.*;

/*<applet code='Program_1' height='300' width='350'></applet>*/

public class Program_1 extends Applet {
	public void paint(Graphics g) {

		// for face....
		g.drawOval(100,50,140,185);

		// for eyes....
		g.setColor(Color.GRAY);
		g.fillOval(135,100,17,23);
		g.fillOval(190,100,17,23);

		// for Nose...
		g.drawLine(172,115,155,160);
		g.drawLine(155,160,177,160);

		// for Smile...

	}
}