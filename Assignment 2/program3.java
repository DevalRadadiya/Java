/*3. Create a Shape class as the abstract class with abstract
method draw( ), its implementation is provided by the Rectangle & Circle
classes. Create a reference of Shape class and if you create the instance of
Rectangle class, draw() method of Rectangle class will be invoked. And same for
Circle class. (Dynamic Method Dispatch) */

abstract class Shape
{
	abstract void draw();
}
	class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing Circle");
	}
}
class pro3
{
	public static void main(String str[])
	{
		Shape s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}