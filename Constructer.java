
class Constructor
{
     public static void main(String[] args)
       {    
          Abc obj=new Abc(6,8.5);
       }
}
class Abc
{
  public Abc()
   {
      System.out.println(" in abc construct "); 
   }
  public Abc(int i)
   {
      System.out.println("in abc parameterized construct");
   }
  public Abc(int i,double d)
   {
      System.out.println(" in abc integerdouble "); 
   }
}


           
 