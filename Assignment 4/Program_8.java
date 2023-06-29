import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*  <applet code='Program_8' height='250' width='370'>
	</applet>  */

public class Program_8 extends Applet {

	Label l1 = new Label("Color.red");
	Button red = new Button("Red");
	Button green = new Button("Green");
	Button blue = new Button("Blue");
	Panel p1 = new Panel();
	class Button1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setBackground(Color.RED);
			p1.setBackground(Color.RED);
		}
	}

	class Button2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setBackground(Color.GREEN);
			p1.setBackground(Color.GREEN);
		}
	}

	class Button3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setBackground(Color.BLUE);
			p1.setBackground(Color.BLUE);
		}
	}

	public void init() {
		p1.setLayout(new GridLayout(1,3,10,10));
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