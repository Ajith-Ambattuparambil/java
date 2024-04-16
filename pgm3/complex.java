class complex
{
	public static void main(String[] ar)
	{
		complexadd re=new complexadd(3.3,4.1);
		complexadd im=new complexadd(1.5,2.4);
		complexadd temp;  //Reference Variable
		temp=complexadd.add(re,im);
		re.display();
		im.display();
		temp.display();
	}
}
class complexadd
{
	double a;
	double b;
	complexadd(double x,double y)
	{
		a=x;
		b=y;
	}
	static complexadd add(complexadd ob1,complexadd ob2)
	{
		complexadd c=new complexadd(0,0);
		c.a=ob1.a+ob2.a;
		c.b=ob1.b+ob2.b;
		return c;
	}
	void display()
	{
		System.out.println(+a+"+"+b+"i");
	}
}
