import graphics.*;
public class Prgrm12
   {
       public static void main(String args[])
           {
                       int r=3,l=5,b=3,h=4;
	  	   Circle c1 = new Circle(r);
	  	   System.out.println("Area of Circle with radius "+r+" is : "+c1.area());
	  	   Rectangle r1 = new Rectangle(l,b);
	  	   System.out.println("Area of Rectangle with length "+l+" and breadth "+b+" is : "+r1.area());
	  	   Square s1 = new Square(l);
	  	   System.out.println("Area of Square with length "+l+" is : "+s1.area());
	  	   Triangle t1 = new Triangle(b,h);
	  	   System.out.println("Area of Triangle with breadth "+b+" and height "+h+" is : "+t1.area());
	  	}
	}



