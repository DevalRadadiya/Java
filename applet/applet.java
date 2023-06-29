// Java program to run the applet
// using the web browser

import java.awt.*;
import java.applet.*;
class Myapplet extends Applet
/* <applet code='Myapplet.class' width='200' height='100'> 
	</applet> */
//package com;
{
	String msg="";
	public void init()
	{
		msg="Hello Geeks";
	}

	public void start()
	{
		msg=msg+",Welcome to GeeksForGeeks";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}
