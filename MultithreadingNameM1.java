
class MultithreadingNameM1
{
    public static void main(String args[]) throws Exception
      { 
        
         Thread t1=new Thread(() ->
              {
                   for(int i=1;i<=5;i++)
                     {
                          System.out.println("Mastek company");
                          try{ Thread.sleep(1000);}catch(Exception e){}
                      }
              });
         Thread t2=new Thread(() ->
               {
                  for(int i=1;i<=5;i++)
                   {
                      System.out.println("self learning");
                      try{ Thread.sleep(1000);}catch(Exception e){}
                   }
               });
         t1.setName("First Thread");
         t2.setName("Second Thread");
         System.out.println(t1.getName());
         System.out.println(t2.getName());
         t1.start();
         try{ Thread.sleep(10);}catch(Exception e){}
         t2.start();
         System.out.println(t2.isAlive());
         t1.join();
         t2.join();
         System.out.println(t1.isAlive());
        
         System.out.println("session modules");
       }
}
