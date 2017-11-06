import java.util.*;
import java.io.*;
class file1
{
public static void main(String args[])
{
try
{
FileOutputStream out=new FileOutputStream("C:\\Users\\Ragupathiraja\\java\\file.txt");
Scanner sc=new Scanner (System.in);
String a;
String[] d={"orange"};

System.out.println("Enter the name of 5 fruits ");

for(int i=0;i<5;i++)
{
a=sc.next();

if(a.equals(d[0]))
{
System.out.println("Not Printed in the file"+a);
}
else
{
System.out.println("Inserted");
byte[] b=a.getBytes();
out.write(b);
}
}
out.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}