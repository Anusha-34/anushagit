class LargeOfThree
{
public static void main(String a[])
{
int num1=35,num2=65,num3=83,large;
large=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
System.out.println(large);
}
}