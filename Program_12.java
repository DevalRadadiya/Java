import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
<applet code=Program_12 height=270 width=350>
</applet>
*/

public class Program_12 extends Applet 
{
	// create panel
	Panel p1 = new Panel();

	// create Text Fields
	TextField red = new TextField();
	TextField green = new TextField();
	TextField blue = new TextField();

	// create Fill Button
	Button Fill = new Button("Fill");

	// Declare R, G, B
	int R=58, G=118, B=214;

	// create msg label
	Label msg = new Label();

	public void init()
	{
		setLayout(null);

		// set font of panel, set layout of panel, add all components in panel and setbounds of panel in applet
		p1.setFont(new Font("", Font.BOLD, 18));
		p1.setLayout(new GridLayout(1, 3, 7, 7));
		p1.add(red);
		p1.add(green);
		p1.add(blue);
		add(p1); // add panel in applet
		p1.setBounds(20, 20, 310, 27); // set bounds of panel in applet

		// add Fill Button with set bounds.
		Fill.setFont(new Font("", Font.BOLD, 17));
		add(Fill);
		Fill.setBounds(220, 83, 50, 25);

		// set msg : label in applet with bounds
		add(msg);
		msg.setFont(new Font("", Font.BOLD, 17));
		msg.setForeground(Color.RED); // set color of label Text.
		msg.setBounds(23, 230, 500, 30);

		// Event on Fill Button
		Fill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(red.getText().equals("") || green.getText().equals("") || blue.getText().equals("")) 
				{
					R=58; 
					G=118; 
					B=214;
					msg.setText("Provide all Three RGB Values Above !");
				}
				else
				{
					// first clear Worning msg
					msg.setText("");

					R = Integer.parseInt(red.getText());
					G = Integer.parseInt(green.getText());
					B = Integer.parseInt(blue.getText());

					if(R<=255 && G<=255 && B<=255) // check RGB value is wright or not 
					{
						repaint(); // recall the paint method
					}
					else
					{
						msg.setText("RGB Values Must Be Less Than 255 !");
					}
				}
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(new Color(R, G, B));
		g.fillRect(115, 95, 120, 120);
	}
}