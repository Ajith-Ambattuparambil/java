class A
  {   
     int x=10;
     void show()
      { 
       System.out.println("The value of X is:"+x);
       }
   }
 class B extends A
   {
     int y=20;
     int x=15;
     void display()
        { 
          super.show();
          System.out.println("The value of Y is:"+y);
        }
     void show()
       {   
         super.show();
         System.out.println("The value of x is:"+x);     
       }
  }             
class inheritdem
   {
      public static void main(String args[])
         {
          B b=new B();
          b.show();
          b.display();
       }
    } 
        
