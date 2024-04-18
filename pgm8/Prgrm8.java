import java.util.Scanner;
class Employee
	{
	  int eno;
	  String ename;
	  double salary;
	  void getemp(int eno,String ename,double salary)
	  	{
	  	  this.eno=eno;
	  	  this.ename=ename;
	  	  this.salary=salary;
	  	}
	  void show()
	  	{
	  	   System.out.println("Employee number: "+eno+"\nEmployee name: "+ename+"\nSalary: "+salary);
	  	
		}
	}
class Prgrm8
	{
	  public static void main(String args[])
	  	{
	  	   Scanner s=new Scanner(System.in);
	  	   int i=0,f=0,eno,n;
	  	   String ename;
	  	   double salary;
	  	   //declaring array of product
	  	   /*Employee e[]=new Employee();
	  	   e[i]=new Employee()*/
	  	   Employee[] emp=new Employee[10];
	  	   System.out.println("Enter the total number of employees you want to store the details:");
	  	   n=s.nextInt();
	  	   for(i=0;i<n;i++)
	  	   	{
	  	   	  emp[i]=new Employee();
	  	   	  System.out.println("Enter the eno of "+(i+1)+"th employee");
	  	   	  eno=s.nextInt();
	  	   	  s.nextLine();
	  	   	  System.out.println("Enter the ename of "+(i+1)+"th employee");
	  	   	  ename=s.nextLine();
	  	   	  System.out.println("Enter the salary of "+(i+1)+"th employee");
	  	   	  salary=s.nextDouble();
	  	   	  //System.out.println(eno + "\n" + ename + "\n" + salary);
	  	   	  emp[i].getemp(eno,ename,salary);
	  	   	}
	  	   	System.out.println("Enter an Eid to search:");
                              int r=s.nextInt();
	  	   for(i=0;i<n;i++)
	  	   	{ 
	  	   	   if(emp[i].eno==r)
	  	   	    {
	  	   	       System.out.println("\n----------------------Employee Details are-----------------------:\n");
	  	   	       emp[i].show(); 
	  	   	       f=1;
	  	   	       }	   	     	       
	  	}
	  	if(f==0)
	 System.out.println("Employee does not exist!"); 
	}
	
}	
