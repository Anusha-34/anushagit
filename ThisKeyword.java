class ThisKeyword
{
    public static void main(String[] args) 
        { 
           A obj = new A(10, 20); 
           obj.display(); 
         }
} 
class  A
{ 
    int a; 
    int b; 
    A(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
    void display() 
    { 
        System.out.println("a = " + a + "  b = " + b); 
    } 
}