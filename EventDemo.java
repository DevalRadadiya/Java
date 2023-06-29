import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="EventDemo" height='400' width='400'></applet>*/
public class EventDemo extends Applet
{
	CheckboxGroup color=new CheckboxGroup();
	Checkbox red=new Checkbox("Red",color,false);
	Checkbox green=new Checkbox("Green",color,false);
	Checkbox blue=new Checkbox("Blue",color,false);
	public void init()
	{
		add(red);
		add(green);
		add(blue);
		red.addItemListener(new ItemListener (){
			public void itemStateChanged(ItemEvent e){
				setBackground(new Color(255,0,0));
				}
		});	
		green.addItemListener(new ItemListener (){
			public void itemStateChanged(ItemEvent e){
				setBackground(new Color(0,255,0));
				}
		});
		blue.addItemListener(new ItemListener (){
			public void itemStateChanged(ItemEvent e){
				setBackground(new Color(0,0,255));
				}
		});
	}
}