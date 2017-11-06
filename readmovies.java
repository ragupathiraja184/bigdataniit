import java.util.*;
import java.io.*;
class readmovies
{
public static void main(String []args)
{
try
{
FileReader f1=new FileReader("C:\\Users\\Ragupathiraja\\java\\movie.txt");
BufferedReader bw=new BufferedReader(f1);
String a,s2;
//String  
int j=0;
//map<String,String>a=new Hashmap<>();
for(int i=0;i<3;i++)
{
while((a=bw.readLine())!=null)
{
String []arr=a.split(",");
for(String s:arr)
{
System.out.println(s);
}
//arr[5]
if(arr[5].equals("u"))
{
System.out.println("the u grade movies are"+ arr[1]);
}
int b=Integer.parseInt(arr[4]);
if(b>4)
{
System.out.println("the 5 star movies are"+ arr[1]);
}
/*arr[6]=s2;
int year=Integer.parseInt(new arr[6]().toString().tosplit("/")[2]);
String s5=String.valueOf(year);
if(s5.equals("2015"))
{
System.out.print("the 2015 movies are "+ arr[1]);
}*/
if(arr[3].equals("khan"))
{
System.out.println("the khan movies are"+ " "+ arr[1]);
}
}
bw.close();
f1.close();
}
}
catch(Exception e)
{
System.out.print(e);
}
}
}