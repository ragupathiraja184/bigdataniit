import java.util.*;
import java.io.*;
class student10
{
public static void main(String []args)
{
try
{
FileOutputStream f1=new FileOutputStream("C:\\Users\\Ragupathiraja\\java\\s10.txt");
FileReader fr=new FileReader("C:\\Users\\Ragupathiraja\\java\\s10.txt");
BufferedReader br=new BufferedReader(fr);
//bOutputStream f1=new FileOutputStream
//FileInputStream f2=new FileInputStream(f1);
ArrayList<String> al= new ArrayList<>();
String s2=",";
String str,sname="dude";
int count=0,j=0;
String studentid[]=new String[10];
Scanner sc=new Scanner(System.in);
String studentname[]=new String[10];
Scanner sc1=new Scanner(System.in);
String studentage[]=new String[10];
int m[]=new int[studentage.length];
Scanner sc2=new Scanner(System.in);
String studentcity[]=new String[10];
Scanner sc3=new Scanner(System.in);
String studentcountry[]=new String[10];
Scanner sc4=new Scanner(System.in);
for(int i=0;i<4;i++)
{
System.out.println("Enter Student ID");
studentid[i]=sc.nextLine();
//sc.nextLine();
//System.out.print(student[i]);
//studentid[i]=sname;
byte []b=studentid[i].getBytes();
f1.write(b);
byte []bc=s2.getBytes();
f1.write(bc);
//if(s5.CharAt(0)=='s'||s5.CharAt(0)=='S')
/*if(sname.substring(1,1).equalsIgnoreCase("s"))
{
byte []b=studentid[i].getBytes();
f1.write(b);
byte []bc=s2.getBytes();
f1.write(bc);
}*/
System.out.println("Enter Student name");
studentname[i]=sc1.nextLine();
//sc1.nextLine();
//System.out.print(studentname[j]);
byte []b1=studentname[i].getBytes();
f1.write(b1);
//System.out.print("written succesfully");
//byte []bc=s2.getBytes();
f1.write(bc);
System.out.println("Enter Student age");
studentage[i]=sc2.nextLine();
sc2.nextLine();
m[i]=Integer.parseInt(studentage[i]);
if(m[i]<100)
{
byte []b2=studentage[i].getBytes();
f1.write(b2);
f1.write(bc);
//System.out.print("written succesfully");
}
else
{
System.out.print("enter the valid age");
}
System.out.println("Enter Student city");
studentcity[i]=sc3.nextLine();
//System.out.println(studentcity[i]);
byte []b3=studentcity[i].getBytes();
f1.write(b3);
//System.out.print("written succesfully");
f1.write(bc);
System.out.println("enter the country");
studentcountry[i]=sc4.nextLine();
//String s1="india";
if(studentcountry[i].equalsIgnoreCase("india"))
{
//System.out.print(studentcountry[i]);
byte []b4=studentcountry[i].getBytes();
f1.write(b4);
//System.out.print("written succesfully");
//byte []bn=s3.getBytes();
f1.write(bc);
//f1.newLine();
}
else
{
System.out.print("enter the valid country");
}
//byte []bn=s3.getBytes();
//f1.write(bn);
//f1.write(bn);
}
f1.close();
System.out.println("written succesfully");
while((str=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(str,",");
				while(st.hasMoreTokens()) {
				al.add(st.nextToken());
				}
			}
			System.out.println(al);
			while(j<3)
			{
				int age=Integer.parseInt(al.get((5*j)+2));
				if(age>21)
				{
				count++;
				}
				String name=al.get((5*j)+1);
				if((name.substring(1,1)).equalsIgnoreCase("A"))
                                //if((name.CharAt(0)=='a')||(name.CharAt(0)=='A'))				
                                {
				System.out.println("Student Name starting with A "+name);
				}
				j++;
			}
			System.out.println("Number of Students greater than 21:"+count);
br.close();			
fr.close();
}
catch(IOException e)
{
System.out.print(e);
}
}
}