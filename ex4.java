import java.util.*;
import java.io.*;
public class ex4
{
public static void main(String []args)
{
try
{
FileOutputStream f=new FileOutputStream("C:\\Users\\Ragupathiraja\\java\\raja.txt");
FileOutputStream f1=new FileOutputStream("C:\\Users\\Ragupathiraja\\java\\raja1.txt");
String s[]=new String[5];
System.out.println("the string are");
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
s[i]=sc.next();
char []x=s[i].toCharArray();
System.out.print(s[i]);
if(x[0]=='a')
{
System.out.print(s[i]);
byte[] b=s[i].getBytes();
f.write(b);
}
else if(x[0]=='e')
{
System.out.print(s);
byte[] b=s[i].getBytes();
f.write(b);
}
else if(x[0]=='i')
{
System.out.print(s[i]);
byte[] b=s[i].getBytes();
f.write(b);
}
else if(x[0]=='u')
{
System.out.print(s[i]);
byte[] b=s[i].getBytes();
f.write(b);
}
else if(x[0]=='o')
{
System.out.print(s[i]);
byte[] b=s[i].getBytes();
f.write(b);
}
//f.write(s);
else
{
System.out.print("consonants" +s[i]);
byte[] b=s[i].getBytes();
f1.write(b);
}
}
f.close();
f1.close();
}
catch(Exception e)
{
System.out.print(e);
}
}
}