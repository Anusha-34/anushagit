import java.util.Scanner;
class Perfect
{
    public static void main(String[] args) 
     {
       int n, s=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any integer ");
       n = sc.nextInt();
       for(int i = 1; i < n; i++)
         {
           if(n % i == 0)
             s=s+i;
         }
       if(s==n)
           System.out.println("Perfect");
       else
           System.out.println(" not Perfect");    
     }
}