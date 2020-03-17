class Palindrome
 {
    public static void main(String a[]) 
         {

             int n=1221,sum=0, r, temp;
             temp = n;
             while( n>0)
               {
                  r= n % 10;
                  sum = sum*10+r;
                  n=n/10;
               }

             if (temp==sum)
                 System.out.println(" 1221 is palindrome");
             else
                 System.out.println(" 1221 is not a palindrome");
    }
}
