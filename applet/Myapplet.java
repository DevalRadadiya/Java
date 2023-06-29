import java.applet.*;
import java.awt.*;
/* <APPLET code="Myapplet.class" width="200" height="100"> 
	</APPLET> */
//package com;
public class Myapplet extends Applet
{
	FlowLayout f1=new FlowLayout();
	Button b1=new Button("Submit");
	Button b2=new Button("Play");
	Button b3=new Button("Stop");
	Button b4=new Button("Reset");
	
	public void init()
	{
		setLayout(f1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}
