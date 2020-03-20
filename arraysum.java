class SumOfArray
{
   public static void main(String args[])
    {
      int[] array = {3,8,7,2,4,5,9,0};
      int s = 0;
      for( int num : array) 
      {
          s = s+num;
      }
      System.out.println("Sum of array elements is:"+s);
    }
}