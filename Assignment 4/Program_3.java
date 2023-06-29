import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
<applet code=Program_3 height=300 width=500>
</applet>
*/

public class Program_3 extends Applet {

	// Text Fields
	TextField tf1 = new TextField(10);
	TextField tf2 = new TextField(10);
	TextField tf3 = new TextField(10);

	// Buttons
	Button b1 = new Button("Add");
	Button b2 = new Button("Sub");
	Button b3 = new Button("Mul");
	Button b4 = new Button("Div");
	Button b5 = new Button("Cancle");

	// Panels
	Panel p1 = new Panel();
	Panel p2 = new Panel();

	public void init() {

		// set layout for panel 1
		p1.setLayout(new GridLayout(4,2,20,20));

		p1.setFont(new Font("",Font.BOLD,15));	
		p1.add(new Label("First Number : "));
		p1.add(tf1);
		p1.add(new Label("Second Number : "));
		p1.add(tf2);
		p1.add(new Label("Result : "));
		p1.add(tf3);
		add(p1);

		// set layout for panel 2
		p2.setLayout(new GridLayout(1,5,10,10));

		p2.setFont(new Font("",Font.BOLD,15));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		add(p2);

		// Anonymous inner class
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				int result = (Integer.parseInt(tf1.getText())) + (Integer.parseInt(tf2.getText()));
				tf3.setText(Integer.toString(result));
			}
		});

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				int result = (Integer.parseInt(tf1.getText())) - (Integer.parseInt(tf2.getText()));
				tf3.setText(Integer.toString(result));
			}
		});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				int result = (Integer.parseInt(tf1.getText())) * (Integer.parseInt(tf2.getText()));
				tf3.setText(Integer.toString(result));
			}
		});

		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				Double result = (Double.parseDouble(tf1.getText())) / (Integer.parseInt(tf2.getText()));
				tf3.setText(Double.toString(result));
			}
		});

		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				tf1.setText("0");
				tf2.setText("0");
				tf3.setText("0");
			}
		});
	}
}