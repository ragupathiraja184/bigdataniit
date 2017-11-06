import java.util.*;
import java.io.*;
class readcustomer
{
public static void main(String []args)
{
//String m[]="";
//ArrayList<String> al=new ArrayList<>();
try
{
FileReader f1=new FileReader("F:\\fff\\custid.txt");
BufferedReader br=new BufferedReader(f1);
String buff;
String[] cal=new String[40];
int count=0,a=0,d=0,e=0;
int j=0,c=0;
while(j<3)
{
while((buff=br.readLine())!=null)
{
String []arr=buff.split(" ");
for(String mal:arr)
{
System.out.println(mal);
//String f[]={"male",""};
}
//while(j<3)
//{
//char []ch=w((10*j)+2).toCharArray();
//String s=String mal[2];
if(arr[2].equals("male"))
{
count++;
//System.out.println("the number of male is"+ count);
}
else
{
c++;
//System.out.println("the number of )
}
if(arr[6].equals("india"))
{
a++;
}
int b=Integer.parseInt(arr[3]);
if(b>18)
{d++;}
if(arr[8].equals(""))
{e++;}
j++;
}
}
System.out.println("the number of male is"+ count);
System.out.println("the number of female is"+ c);
System.out.println("the number of customer in india is"+ a);
System.out.println("the number of customer whose age is greater than 18 is"+ d);
System.out.println("the number of customer who doesnot have number is"+ e);
br.close();
f1.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}