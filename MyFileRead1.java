import java.io.*;
 public class MyFileRead1 {
       public static void main(String a[]){
       InputStream is = null;
       BufferedInputStream bis = null;
       DataInputStream dis = null;
        try {
            is = new FileInputStream("emp.txt");
            bis = new BufferedInputStream(is);
            dis = new DataInputStream(bis);
            String temp = null;
            while((temp = dis.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}