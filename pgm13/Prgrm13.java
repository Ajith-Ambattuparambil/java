import java.util.Scanner;
class Auth extends Exception
{
	Auth(String msg)
	{
		super(msg);
	}
}
class Prgrm13
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String username="Ajith";
		String password="123";
		System.out.println("Enter the username");
		String user=s.nextLine();
		System.out.println("Enter the password");
		String pass=s.nextLine();
		try
		{
			if(user.equals(username) && pass.equals(password))
				throw new Auth("Login Success!");
			else 
				throw new Auth("Login Failed!");
		              	
		}
		catch(Auth a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Authentication Done");
		}
	}
}
