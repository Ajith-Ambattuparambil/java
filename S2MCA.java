class S2MCA
  {
    public static void main(String a[])
    {
         
         int rol=Integer.parseInt(a[0]);
        double mark=Double.parseDouble(a[3]);
        System.out.println("Roll No\t"+rol);
        System.out.println("Name\t"+a[1]);
        System.out.println("Course\t"+a[2]);
        System.out.println("Mark\t"+mark);
        S2MCA d=new S2MCA();
        mark=d.intt(mark);
        show(mark);
        }
    double intt(double mark){
        mark=mark+50.4;
        return mark;
        }
        //void intt(){ 
        static  void show(double mark){
        System.out.println("Total\t"+mark);
        }
        }
