import java.util.*;
import java.io.*;
class readproduct1
{
public static void main(String []args)
{
try
{
FileReader f1=new FileReader("C:\\Users\\Ragupathiraja\\java\\product1.java");
BufferedReader bw=new BufferedReader(f1);
String a;
int j=0;
for(int i=0;i<3;i++)
{
while((a=bw.readLine())!=null)
{
String[] arr=a.split(",");
for(String ab:arr)
{
System.out.println(ab);
}
//if(arr[(7*j)+1])>arr[(7*j)]
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}