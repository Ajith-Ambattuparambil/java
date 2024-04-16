import java.util.Scanner;
class overload
{
    void area(float x) //abstract void area();
    {
        System.out.println("The area of the Square is "+ x*x +" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the Rectangle is "+ x*y +" sq units");
    }
    void area(float x, float y, float z)
    {
      float a = 2*(x*y+y*z+x*z);
        System.out.println("The area of the Cuboid is "+ a +" sq units");
    }
}
class Prgrm9
{
     public static void main(String args[]) 
	{
	   Scanner s = new Scanner(System.in);
	   overload ob = new overload();
	   System.out.println("Enter the side of square: ");
	   float n = s.nextFloat();
	   System.out.println("Enter the two sides of rectangle: ");
	   float p = s.nextInt();
	   //System.out.println("Enter the other side of rectangle: ");
	   float q = s.nextInt();
	   System.out.println("Enter the length, height and breadth of cuboid: ");
	   float l = s.nextFloat();
	   float b = s.nextFloat();
	   float h = s.nextFloat();
	   ob.area(n);
	   ob.area(p,q);
	   ob.area(l,b,h);
        }
}
