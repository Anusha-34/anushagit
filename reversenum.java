class ReverseNumber
{
   public static void main(String args[])
   {
      int n=987,r;
      int sum =0;
      while( n >0 )
      {
          r = n % 10;
          sum =sum*10 +r ;
          n = n/10;
      }

      System.out.println("Reverse of given number is: "+sum);
   }
}