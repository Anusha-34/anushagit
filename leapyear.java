class LeapYear
{
public static void main(String a[])
{
int l=2020;
if((l%4==0)&&((l%100!=0)||(l%400==0)))
System.out.println("Leap Year");
else
System.out.println("Not a Leap Year");
}
}
