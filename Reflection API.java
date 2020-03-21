interface A
{

}
class ReflectionApiProgram
 {
   public static void main(String args[]) throws Exception
     {
       Class c =Class.forName("com.anusha.A");
       System.out.println(c.isInterface());
     }
  }


