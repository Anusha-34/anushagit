interface Abc 
{
    void show();
}

class Interface2
{
     public static void main(String[] args)
        {
          Abc obj=new Abc()
           {
              public void show()
                   {  
                         System.out.println("Anusha Yaram");
                   }
            };

          obj.show();
        }
} 