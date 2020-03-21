class FilesProgram
{
   public static void main(String args[]) throws Exception
       {
          FileOutputStream fos= new FileOutputStream("demo.txt");
          DataOutputStream dos= new DataOutputStream(fos);
          dos.WriteUTF("Demo Content");
          FileInputStream fis= new FileInputStream("demo.txt");
          DataInputStream dis= new FileInputStream("dis");
          String str=readUTF();
          System.out.println(str);
        }
}