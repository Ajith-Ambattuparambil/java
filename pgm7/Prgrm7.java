class Prgrm7
{
	public static void main(String arg[])
	{
		String str="    Hello,Ajith    ";

		System.out.println("Concatinated String: "+str.concat("Welcome to java ")+"\n"); 

		System.out.println("Substring from index 11: "+str.substring(11)+"\n");

		System.out.println("Starting index of Ajith is: "+str.indexOf("Ajith")+"\n");

		System.out.println("Replaced String is: "+str.replace("Ajith","Rockiey")+"\n");

		if(str.equals("Hello,Ajith"))
			System.out.println("Strings are equal\n");
		else
			System.out.println("Strings are not equal\n");

		System.out.println("Trimmed String is: "+str.trim()+"\n");

		System.out.println("Uppercase: "+str.toUpperCase()+"\n");
		System.out.println("Lowercase: "+str.toLowerCase()+"\n");

		System.out.println("Length: "+str.length()+"\n");

		System.out.println("Character at specified index: "+str.charAt(11)+"\n");

		String temp[]=new String[str.length()];
		temp=str.trim().split(",");
		System.out.println("The splitted words are :");
		for(int i=0;i<temp.length;++i)
			System.out.print(temp[i]+"\n");
		System.out.print("\n");
	}
}
