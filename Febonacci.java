import java.util.Scanner;
class Febonacci
{
    public static void main(String a[])
    {
       int k,b=1,c=1;
       Scanner sc=new Scanner(System.in);
       k=0;
       System.out.println("Enter any number");
       int n=sc.nextInt();
       System.out.println("1 1 ");
       while(k<=n)
       {
          k=b+c;
          if(k>=n)
            break;
          System.out.println(k + " ");
          b=c;
          c=k;
       }
     }
}  


