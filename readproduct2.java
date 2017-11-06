import java.util.*;
import java.io.*;
class readproduct2
{
public static void main(String []args)
{
try
{
FileReader fn=new FileReader("C:\\Users\\Ragupathiraja\\java\\product1.txt");
BufferedReader bw=new BufferedReader(fn);
String a,ss,sq;
String[] arr=new String[56];
int j=0;
float max=0;
//Hashmap<String,Float> al=new Hashmap<>();
for(int i=0;i<3;i++)
{
while((a=bw.readLine())!=null)
{
arr=a.split(",");
for(String ab:arr)
{
System.out.println(ab);
}
for(j=0;j<arr.length-1;j++)
{
for(int k=1;k<arr.length;k++)
{
int m=((7*j)+3);
int n=((7*k)+3);
arr[m]=ss;
arr[n]=sq;
f1=Float.parseFloat(ss);
f2=Float.parseFloat(sq);
if(f1>f2)
{
max=f1;
f1=f2;
f2=max;
}
ss=Float.toString(f1);
sq=Float.toString(f2);
}
}
}
}
System.out.println("the highest price is"+ " "+ arr[17]);
System.out.println("the highest customer is"+ " "+ arr[14]);
bw.close();
fn.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}