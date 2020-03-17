class PrimeNum 
{
     public static void main(String a[])
       {

           int num = 89;
           boolean isPrime= true;
           for(int i = 2; i <= num/2; ++i)
             {   
               if(num % i == 0)
                 {  
                   isPrime = false;
                   break;
                 }
             }

           if (isPrime)
              System.out.println("89 is a prime number");
           else
              System.out.println( "89  is not a prime number");
        }
}