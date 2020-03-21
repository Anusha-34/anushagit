class Hi
{
   public void show()
     {
        for(int i=1;i<=5;i++)
   
      {
           System.out.println("ANUSHA");
           try{ Thread.sleep(500);}catch(Exception e){}

          }
      }
}
class Hello
{
   public void show()
     {
        for(int i=1;i<=5;i++)
         {
           System.out.println("YARAM");
           try{ Thread.sleep(500);}catch(Exception e){}
          }
      }
}
class Multithreading2
{
    public static void main(String args[])
      { 
         Hi obj1=new Hi();
         Hello obj2=new Hello();
         obj1.show();
         obj2.show();
       }
}
