class PowerOfNum {
    public static void main(String[] args) {
    	        int number = 2, p = 5;
                long result = 1;
                int i = p;
               for (;i != 0; --i)
                {
                  result *= number;
                }
         
      
        System.out.println(number+"^"+p+" = "+result);
    }
}
