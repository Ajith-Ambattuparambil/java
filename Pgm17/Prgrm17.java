import java.io.*;
class Prgrm17
{
	public static void main(String arg[]) throws IOException
	{
		String s;
		try
		{
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br1=new BufferedReader(in);
			System.out.println("Enter the string:");	
			s=br1.readLine();
			FileWriter fw=new FileWriter("/home/user/Documents/Ajith mani Santhosh/Java/Pgm17/Prgrm17.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(s);
			//bw.append("Data Appended");
			bw.close();
			System.out.println("The data wrote is:");
			FileReader fr=new FileReader("/home/user/Documents/Ajith mani Santhosh/Java/Pgm17/Prgrm17.txt");
			BufferedReader br2=new BufferedReader(fr);
			while((s=br2.readLine())!=null)
			{
				System.out.println(s);			
			}
			br2.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}
