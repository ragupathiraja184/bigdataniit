import java. util.*;
import java. Io *;
class WriteTest
{
 public static void main(String[] args)
 {
  try 
  {
   File fl = new File("d:/emp1.txt");
   String str="Write this string to my file";
   FileWriter fw = new FileWriter(fl) ;
   fw.write(str);
   fw.close();
   fl.close();
  }
  catch (IOException  e)
  { e.printStackTrace(); }
 }
}