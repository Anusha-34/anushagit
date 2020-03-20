class HumanBeing
{  
void run()
{
    System.out.println("running");}  
}  
class Women extends HumanBeing
{  
void sleep()
{
   System.out.println("sleeping");}  
}  
class Inheritance2{  
public static void main(String args[]){  
Women d=new Women();  
d.run();  
d.sleep();  
}
}  