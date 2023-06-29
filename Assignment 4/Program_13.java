import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*	<applet code='Program_13' height='200' width='580'> 
	</applet> */
	
public class Program_13 extends Applet
{
	// create two list;
	List n1=new List(4,true); // True is Use For Multiple Selection.
	List n2=new List(4,true);
	
	//Create Four Button;
	Button b1=new Button(">");
	Button b2=new Button("<");
	Button b3=new Button(">>");
	Button b4=new Button("<<");
	
	public void init()
	{
		setLayout(null);
		//set list1;
		n1.add("Apple");
		n1.add("Banana");
		n1.add("Orange");
		n1.setBounds(25,5,150,70);//25 ne vadharvathi right side move
		add(n1);
		
		//set list2;
		/*l2.add("");
		l2.add("");
		l2.add("");*/
		n2.setBounds(350,5,150,70);
		add(n2);
		
		//add Buttons
		b1.setBounds(190,35,30,20);// x ne ghatadvathi right side; 
		add(b1);
		b2.setBounds(230,35,30,20);
		add(b2);
		b3.setBounds(270,35,30,20);
		add(b3);
		b4.setBounds(310,35,30,20);
		add(b4);
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected[] = n1.getSelectedItems();	
				for(int i=0; i<1; i++)
				{
					n2.add(selected[i]);
					n1.remove(selected[i]);
				}
			}
		});
		
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected[] = n2.getSelectedItems();	
				for(int i=0; i<1; i++)
				{
					n1.add(selected[i]);
					n2.remove(selected[i]);
				}
			}
		});
		
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected[] = n1.getSelectedItems();
				for(String item : selected)
				{
					n2.add(item);
					n1.remove(item);
				}
			}
		});
		
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String selected[] = n2.getSelectedItems();
				for(String item : selected)
				{
					n1.add(item);
					n2.remove(item);
				}
			}
		});
	}
}