class ArmstrongNum
 {
    public static void main(String[] args)
     {

        int num = 173,r,temp,sum=0;
        temp=num;
        while (num>0)
        {
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }

        if(sum==num)
            System.out.println("173 is an Armstrong number");
        else
            System.out.println( " 173 is not an Armstrong number");
     }
}