import java.io.* ;
public class IO
{
    public static void main(String[] args) throws IOException {


        File dir = new File("new directory");
        dir.mkdir();
        System.out.println(dir.exists());

        File f1 = new File(dir,"PW cheak");
        System.out.println(f1.exists());
          try {
                f1.createNewFile();
              }
          catch(Exception e )
          {
            System.out.println("exception occur");
            System.out.println(e);
          }
        System.out.println(f1.exists());


       File f2 = new File(dir, "PW cheak");
       FileWriter fw = new FileWriter(f2,true);
       PrintWriter pw = new PrintWriter (fw);
       pw.println(678);
        pw.println("yes");
        pw.println(true);
        pw.println("i did");
        pw.close();
        FileReader fr = new FileReader(f2);
        BufferedReader br = new BufferedReader(fr);
        String s1= br.readLine();
        while(s1!=null)
        {
            s1=br.readLine();
            System.out.println(s1);
        }
        br.close();



    }
}
