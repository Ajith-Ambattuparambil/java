import java.util.Scanner;
class Matrixadd
   {
      public static void main(String args[])
        {
          int [][] a=new int[10][10];
          int [][] b=new int[10][10];
          int [][] c=new int[10][10];
          int m,n,i,j;
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the size of the matrix as Rows and Columns: ");
          m=s.nextInt();
          n=s.nextInt();
          System.out.println("Enter the elements in the first matrix: ");
          for(i=0;i<m;i++)
              { 
               for(j=0;j<n;j++)
                   {
                    a[i][j]=s.nextInt();
                 }
           }
        System.out.println("Enter the elements in the Second matrix: ");
        for(i=0;i<m;i++)
              { 
               for(j=0;j<n;j++)
                    {
                      b[i][j]=s.nextInt();
                         }
           }            
       for(i=0;i<m;i++)
           { 
           for(j=0;j<n;j++)
              {
               c[i][j]=a[i][j]+b[i][j];
              }
       } 
    System.out.println("The resultant matrix is:");    
    for(i=0;i<m;i++)
         { 
           for(j=0;j<n;j++)
              {
              System.out.print(c[i][j] + " ");
              }System.out.println();
       }       
   }}    
