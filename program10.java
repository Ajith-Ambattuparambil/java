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
	  	   System.out.println("Employee number: "+eno+"\nEmployee name: "+ename+"\n Salary: "+salary);
	  	
		}
	}
class program10
	{
	  public static void main(String args[])
	  	{
	  	   Scanner s=new Scanner(System.in);
	  	   int i=0,eno,n=3;
	  	   String ename;
	  	   double salary;
	  	   //declaring array of product
	  	   Employee[] emp;
	  	   emp=new Employee[10];
	  	   for(;i<n;i++)
	  	   	{
	  	   	  emp[i]=new Employee();
	  	   	  System.out.println("Enter the eno of "+(i+1)+"th employee");
	  	   	  eno=s.nextInt();
	  	   	  s.nextLine();
	  	   	  System.out.println("Enter the ename of "+(i+1)+"th employee");
	  	   	  ename=s.nextLine();
	  	   	  System.out.println("Enter the salary of "+(i+1)+"th employee");
	  	   	  salary=s.nextDouble();
	  	   	  System.out.println(eno+ename+salary);
	  	   	  emp[i].getemp(eno,ename,salary);
	  	   	}
	
	  	   for(i=0;i<n;i++)
	  	   	{
	  	   	 emp[i].show(); 	
	  	   	}
	  	 
	  	}
	}
