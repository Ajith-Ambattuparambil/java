import java.util.Scanner;
class program2
  {
     public static void main(String args[])
        {
           product p1 = new product();
           product p2 = new product();
           product p3 = new product();
           float p1price=p1.accept();
           float p2price=p2.accept();
           float p3price=p3.accept();
           System.out.println("The product with lowest price is: ");
           if(p1price<p2price && p1price<p3price)
           p1.display();
           else if(p2price<p3price)
           p2.display();
           else
           p3.display();
        }
   }
class product
      {
          int pcode;
          String pname;
          float pprice;
          float accept()
                 {
                  Scanner s = new Scanner(System.in);
                  System.out.println("Enter product: ");
                  pname=s.nextLine();
                  System.out.println("Enter code: ");
                  pcode=s.nextInt();
                  System.out.println("Enter price: ");
                  pprice=s.nextFloat();
                  return pprice;
              }
 void display()
    {
        System.out.println("Product code= "+pcode);
        System.out.println("Product code= "+pname);
        System.out.println("Product code= "+pprice);
    }  
 }                
