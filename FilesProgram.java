import java.io.DataOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class FilesProgram
{
   public static void main(String args[]) throws Exception
       {  
          File f=new File("demo.txt");
          FileOutputStream fos= new FileOutputStream(f);
          DataOutputStream dos= new DataOutputStream(fos);
          dos.WriteUTF("Demo Content");
          FileInputStream fis= new FileInputStream(f);
          DataInputStream dis= new DataInputStream("fis");
          String str=dis.readUTF();
          System.out.println(str);
        }
}