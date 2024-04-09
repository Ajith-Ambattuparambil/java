import java.util.Scanner;
class array
   {
     public static void main(String args[])
        {
          arfun ar=new arfun();
          ar.get_array();
          ar.display();
          ar.sum();
          }
      }
class arfun
    {
       Scanner s = new Scanner(System.in);
          int n,sum=0;
          int[] ar=new int[10];
          void get_array()
                {          
                System.out.print("Enter length: ");
                n=s.nextInt();
                System.out.print("Enter array:");
                for(int i=0;i<n;i++)
                             {
                               ar[i] =s.nextInt();
                          }
             }
        void display()
            {
               for(int i=0;i<n;i++)
                   {
                System.out.println(ar[i] + " ");
                   } 
            }
        void sum()
           {
              for(int i=0;i<n;i++)
                   { 
                    sum = ar[i] + sum;
                  }
        System.out.println(sum);
       }
   }               
                            
