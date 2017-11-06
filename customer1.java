import java.util.*;
import java.io.*;
public class customer1
{
public static void main(String []args)
{
try
{
FileWriter f1=new FileWriter("C:\\Users\\Ragupathiraja\\java\\custid.txt");
BufferedWriter bw=new BufferedWriter(f1);
FileReader f2=new FileReader("C:\\Users\\Ragupathiraja\\java\\custid.txt");
BufferedReader br=new BufferedReader(f2);
String cid,cname,cgender,cage,cadd,city,country;
String pin,phone,dob;
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
System.out.println("enter the customer id");
cid=sc.nextLine();
bw.write(cid);
bw.write(" ");
System.out.println("enter cname");
cname=sc.nextLine();
bw.write(cname);
bw.write(" ");
System.out.println("enter the gender");
cgender=sc.nextLine();
bw.write(cgender);
bw.write(" ");
System.out.print("enter the age");
cage=sc.nextLine();
bw.write(cage);
bw.write(" ")
System.out.println("enter address");
cadd=sc.nextLine();
bw.write(cadd);
bw.write(" ");
System.out.println("enter city");
city=sc.nextLine();
bw.write(city);
bw.write(" ");
System.out.println("enter the country");
country=sc.nextLine();
bw.write(country);
bw.write(" ");
System.out.println("enter the pin");
pin=sc.nextLine();
bw.write(pin);
bw.write(" ");
System.out.println("enter the phone");
phone=sc.nextLine();
bw.write(phone);
bw.write(" ");
System.out.println("enter date of birth");
dob=sc.nextLine();
bw.write(dob);
bw.write(" ");
bw.newLine();
}
bw.close();
f1.close();
}
catch(IOException e)
{
System.out.print(e);
}
}
}

