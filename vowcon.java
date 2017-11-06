import java.util.*;
import java.io.*;

class vowcon 
{
public static void main(String args[])
{
try
{
FileInputStream out=new FileInputStream("C:\\Users\\Ragupathiraja\\java\\abcd.txt");
BufferedInputStream out1=new BufferedInputStream(out);
int i=0;
while((i=out1.read())!=-1)
{
System.out.print((char)i);
}
out1.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
