import java.util.Scanner;
class pgm4
   {
      public static void main(String args[])
          {
             Scanner s = new Scanner(System.in);
             System.out.println("Enter the no of rows: ");
             int m = s.nextInt();
             System.out.println("Enter the no of columns: ");
             int n = s.nextInt();
             Matrix ma=new Matrix();
             System.out.println("Enter the first matrix: ");
             int a[][]=ma.read(m,n);
             System.out.println("Enter the second matrix: ");
             int b[][]=ma.read(m,n);
             ma.add(a,b);
           }
    }       
class Matrix
   {
        Scanner s = new Scanner(System.in);
        int[][] read(int m, int n)
        {
		int res[][]=new int[m][n];
		for(int i=0;i<m;++i)
		{
			for(int j=0;j<n;++j)
				res[i][j]=s.nextInt();
		}
		return res;
	}           
      void add(int a1[][], int a2[][])
           {
              System.out.println("Summed array is:");
		for(int i=0;i<a1[1].length;++i)
		{
			for(int j=0;j<a1.length;++j)
				System.out.print(a1[i][j]+a2[i][j]+"\t");
			System.out.println();
		}
	  }	
    }
