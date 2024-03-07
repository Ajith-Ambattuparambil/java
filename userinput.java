import java.util.Scanner;
class userinput
{
  int rollno;
  String name;
  float mark;
  void showdetail()
  {
    System.out.println("This is Non-Static method: ");
    System.out.println("   Student Details");
    System.out.println("Name: "+name);
    System.out.println("Rollno.: "+rollno);
    System.out.println("Mark: "+mark);
   }
  static void show()
  {
    System.out.println("This is static method");
    }
   public static void main(String args[])
   {
    try
     {
      Scanner s=new Scanner(System.in);
      userinput u = new userinput();
      System.out.println("Enter Rollno.:");
      u.rollno=s.nextInt();
      s.nextLine();
      System.out.println("Enter Name: ");
      u.name=s.nextLine();
      System.out.println("Enter Marks: ");
      u.mark=s.nextFloat();
      u.showdetail();
      show();
      }
      catch(Exception e)
      {
      System.out.println(e);
     }
   }
  }    
