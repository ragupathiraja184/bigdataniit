import java.util.*;
//import java.util.date;
import java.io.*;
class product
{
public static void main(String []args)
{
try
{
FileWriter f1=new FileWriter("C:\\Users\\Ragupathiraja\\java\\product1.txt");
BufferedWriter bw=new BufferedWriter(f1);
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
String cid,pid,date,ptype;
float price,total,discount;
int quantity;
for(int i=0;i<3;i++)
{
System.out.println("enter the customer id");
cid=sc.nextLine();
bw.write(cid);
bw.write(",");
System.out.println("enter the product id");
pid=sc.nextLine();
bw.write(pid);
bw.write(",");
System.out.println("enter the product price");
price=sc1.nextFloat();
String bf=Float.toString(price);
bw.write(bf);
bw.write(",");
System.out.println("enter the quantity");
quantity=sc2.nextInt();
String fd=Integer.toString(quantity);
bw.write(fd);
bw.write(",");
System.out.println("enter the date");
date=sc.nextLine();
bw.write(date);
bw.write(",");
System.out.println("enter tge product type");
ptype=sc.nextLine();
bw.write(ptype);
bw.write(",");
System.out.println("enter the price");
price=sc1.nextFloat();
//sc1.next();
String sd=Float.toString(price);
bw.write(sd);
bw.write(",");
System.out.println("enter the discount");
discount=sc1.nextFloat();
sc1.next();
String discount1=Float.toString(discount);
bw.write(discount1);
bw.write(",");
System.out.println("enter the quantity");
total=((quantity*price)-discount);
System.out.println("the total amount is"+ " "+ total);
String ss=String.valueOf(total);
bw.write(ss);
}
bw.close();
f1.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}