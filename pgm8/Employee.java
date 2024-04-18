import java.util.Scanner;
class Employee
{
int eno;
String ename;
int eSalary;
Scanner s=new Scanner(System.in);
void inDetails()
{
System.out.print("Employee Id:");
eno=s.nextInt();
System.out.print("Employee Name:");
s.nextLine();
ename=s.nextLine();
System.out.print("Employee Salary:");
eSalary=s.nextInt();
System.out.println();
}
void dispDetails(Employee e[],int n)
{
System.out.println("Enter an Eid to search");
int r=s.nextInt();
for(int i=0;i<n;i++)
{
if(e[i].eno==r)
{
System.out.println("---------Employee Details are----------");
System.out.println("Employee name:"+ename+"\nEmployee Salary:"+eSalary);
}
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter No of Employees:");
int n=s.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
e[i]=new Employee();
e[i].inDetails();
}
e[1].dispDetails(e,n);
}
}

