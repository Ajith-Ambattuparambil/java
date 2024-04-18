import java.util.Scanner;
interface Shape
	{
	  double area();
	  double perimeter();
	}
class Circle implements Shape
	{
	  double radius;
	  Circle(double radius)
	  	{
	  	  this.radius=radius;
	  	}
	 public double area()
	  	{
	  	  return 3.14*radius*radius;
	  	}
	  public double perimeter()
	  	{
	  	 return 2*3.14*radius;
	  	}
	}
class Rectangle implements Shape
	{
	  double length,breadth;
	  Rectangle (double length,double breadth)
	  	{
	  	  this.length=length;
	  	  this.breadth=breadth;
	  	}
	  public double area()
	  	{
	  	   return length*breadth;
	  	}
	  public double perimeter()
	  	{
	  	   return 2*(length+breadth);
	  	}
	  	
	}
class Prgrm11
	{
	  public static void main(String args[])
	  	{
	  	  Scanner s = new Scanner(System.in);
	  	  float n,l,b;
	  	  System.out.println("Enter the radius of circle:");
	  	  n=s.nextFloat();
	  	  System.out.println("Enter the length and breadth of rectangle:");
	  	  l=s.nextFloat();
	  	  b=s.nextFloat();
	  	  Circle c=new Circle(n);
	  	  System.out.println("The Circle with radius "+n+" have area "+c.area()+" and perimeter "+c.perimeter()); 
	  	  Rectangle r=new Rectangle(l,b);
	  	  System.out.println("The Rectangle with length "+l+" and breadth "+b+" have area "+r.area()+" and perimeter "+r.perimeter());
	  	}
	}
