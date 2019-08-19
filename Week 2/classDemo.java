//classes and objects

class Circle{
	double x,y;
	double r;

	double circumference(){
		return 2*3.14159*r;
	}

	double area(){
		return 3.14159*r*r;
	}
}

class Box{
	double width;
	double height;
	double depth;

	double area(){
		double a;
		a = (width*height*+height*depth+width*depth)*2;
		return a;
	}

	double volume(){
		double v;
		v = width*height*depth;
		return v;
	}
}

class classDemo{
	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle();
		Box b=new Box();

		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;

		c2.x=4.0;
		c2.y=8.0;
		c2.r=10.0;

		b.width=3.0;
		b.height=4.0;
		b.depth=5.0;

		System.out.println("Circumference of circle 1:"+c1.circumference());
		System.out.println("Area of circle 1:"+c1.area());
		
		System.out.println("Circumference of circle 2:"+c2.circumference());
		System.out.println("Area of circle 2:"+c2.area());

		System.out.println("Area of box:"+b.area());
		System.out.println("Volume of box:"+b.volume());
	}
}