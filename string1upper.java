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
           s1=s1.toUpperCase();
           System.out.println("the upper case of s1:"+s1);
       }
      
 }   