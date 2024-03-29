class Box{
	double width;
	double height;
	double depth;
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	Box(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}Box(double len) {
		width=height=depth=len;
	}
	
	double volume(){
		return width*height*depth;
	}
}
class BoxWeight extends Box {
	double weight;
	BoxWeight(double w,double h,double d,double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}
class Inheritance {
	public static void main(String str[]) {
		BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume of Box1 is "+vol);
		System.out.println("Weight of myBox1 is "+mybox1.weight);
		System.out.println();
		
		vol=mybox2.volume();
		System.out.println("Volume of myBox2 is "+vol);
		System.out.println("Weight of myBox2 is "+mybox2.weight);
	}
}