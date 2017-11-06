import java.util.*;
import java.io.*;
class customer
{
public static void main(String []args)
{
try
{
FileWriter f1=new FileWriter("C:\\Users\\Ragupathiraja\\java\\cust.txt");
BufferedWriter bw=new BufferedWriter(f1);
Scanner sc=new Scanner(System.in);
String studentid;
String studentname;
int studentage;
String studentcity;
String studentcountry;
for(int i=0;i<10;i++)
{
studentid=sc.next();
if(substring(studentid,1,1)
bw.write(studentid);
studentname=sc.next();
bw.write(studentname);
studentage=sc.nextInt();
bw.write(studentage);
studentcity=sc.next();
bw.write(studentcity);
studentcountry=sc.next();
bw.write(studentcountry);
}
bw.close();
}
catch(IOException e)
{
System.out.print(e);
}
}
}