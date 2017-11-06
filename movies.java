import java.util.*;
import java.io.*;
class movies
{
public static void main(String []args)
{
try
{
FileWriter f1=new FileWriter("C:\\Users\\Ragupathiraja\\java\\movie.txt");
BufferedWriter bw=new BufferedWriter(f1);
Scanner sc=new Scanner(System.in);
String mid,mname,mdirector,mactor,mrating;
String mtype,mdate;
for(int i=0;i<3;i++)
{
System.out.println("enter the movieid");
mid=sc.nextLine();
bw.write(mid);
bw.write(",");
System.out.println("enter the moviename");
mname=sc.nextLine();
bw.write(mname);
bw.write(",");
System.out.println("enter the movie director");
mdirector=sc.nextLine();
bw.write(mdirector);
bw.write(",");
System.out.println("enter the movie actor");
mactor=sc.nextLine();
bw.write(mactor);
bw.write(",");
System.out.println("enter the movie rating");
mrating=sc.nextLine();
bw.write(mrating);
bw.write(",");
System.out.println("enter the movie type");
mtype=sc.nextLine();
bw.write(mtype);
bw.write(",");
System.out.println("enter the movie date");
mdate=sc.nextLine();
bw.write(mdate);
bw.newLine();
}
bw.close();
f1.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}