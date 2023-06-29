import java.io.FileInputStream;
public class hallo
{
   
        public static void main(String args[]) {
           try {
            {
                FileInputStream fout = new FileInputStream("D:\\testout.txt");
                int i=0;
                while((i=fout.read())!=-1)
                {
                    System.out.println((char)i);
                } 
                System.out.println("Sucess.....");
            }
           } catch (Exception e) {
                System.out.println(e);
           }
       }
}

