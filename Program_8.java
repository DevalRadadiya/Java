import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
<applet code=Program_8 height=250 width=370>
</applet>
*/

public class Program_8 extends Applet {

	Label label = new Label("Color.red");

	Button red = new Button("Red");
	Button green = new Button("Green");
	Button blue = new Button("Blue");

	Panel p1 = new Panel();

	// create three inner class for three buttons
	class Button1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// set Red color for applet
			setBackground(Color.RED);

			// set Red color for panel
			p1.setBackground(Color.RED);
		}
	}

	class Button2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// set Green color for applet
			setBackground(Color.GREEN);

			// set Green color for panel
			p1.setBackground(Color.GREEN);
		}
	}

	class Button3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// set Blue color for applet
			setBackground(Color.BLUE);

			// set Blue color for panel
			p1.setBackground(Color.BLUE);
		}
	}

	public void init() {

		// setFont(new Font("",Font.BOLD,15));
		p1.setLayout(new GridLayout(1,3,10,10));

		// set font for buttons
		setFont(new Font("",Font.ITALIC,17));	

		p1.add(red);	
		p1.add(green);
		p1.add(blue);
		add(p1);

		red.addActionListener(new Button1());	
		green.addActionListener(new Button2());	
		blue.addActionListener(new Button3());	
	}
}