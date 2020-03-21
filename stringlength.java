import java.util.Scanner;
 class StringPrograms
 {
    public static void main(String[] args)
      { 
           String s1,s2;
           Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter two strings:");
           s1=sc.nextLine();  
           s2=sc.nextLine();
           int l1=s1.length();
           int l2=s2.length();
           System.out.println("Length of s1:"+l1);
           System.out.println("Length of s2:"+l2);

      }
  }    