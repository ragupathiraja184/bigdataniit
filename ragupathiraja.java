import java.util.*;
class ragupathiraja
{
public static void main(String h[])
{
//ragupathiraja s=new ragupathiraja();
//s.void display();
String str1="",str2="",str3="",str4="";
Scanner sc1=new Scanner(System.in);
str1=sc1.next();
System.out.print(str1);
char[] ch1=str1.toCharArray();
Scanner sc2=new Scanner(System.in);
str2=sc2.next();
System.out.print(str2);
char[] ch2=str2.toCharArray();
Scanner sc3=new Scanner(System.in);
str3=sc3.next();
System.out.print(str3);
char[] ch3=str3.toCharArray();
Scanner sc4=new Scanner(System.in);
str4=sc4.next();
System.out.print(str4);
char[] ch4=str4.toCharArray();
//public void display()
for(int i=0;i<5;i++)
{
ch1[i]=sc1.nextCharAt(i);
System.out.print(ch1[i]);
}
//System.out.print("\n");
//Scanner sc2=new Scanner(System.in);
//str2=sc2.nextLine();
//System.out.print(str2);
//char[] ch2=str2.toCharArray();
for(int j=0;j<5;j++)
{
ch2[j]=sc2.nextCharAt(j);
System.out.print(ch2[j]);
}
//Scanner sc3=new Scanner(System.in);
//str3=sc3.next();
//System.out.print(str3);
//char[] ch3=str3.toCharArray();
for(int k=0;k<5;k++)
{
ch3[k]=sc3.nextCharAt(k);
System.out.print(ch3[k]);
}
//Scanner sc4=new Scanner(System.in);
//str4=sc4.nextLine();
//System.out.print(str4);
//char[] ch4=str4.toCharArray();
for(int l=0;l<4;l++)
{
ch4[l]=sc4.nextCharAt(l);
System.out.print(ch4[l]);
}
//void compare()
//{
for(int m=0;m<5;m++)
{
ch1=sc1.CharAt(m);
System.out.print(ch1[m]);//APPLE
}
if(ch1[0]==ch2[0])//compare apple and angel
{
for(int m=1;m<5;m++)
{
ch2[m]=sc2.nextCharAt(m);
//System.out.print(ch1[m]);
System.out.println(ch2[m]);
System.out.println("\n");
}
}
if(ch1[4]==ch3[0])
{
for(int s=1;s<5;s++)
{
ch3=sc3.nextLine.CharAt(s);
System.out.print("    ");
//ch1=sc1.nextLine.CharAt(0);
System.out.println(ch3[4]+ch3[s]);
}
}
if(ch1[4]==ch4[0]&&ch4[4]==ch3[4])
{
for(int t=1;t<4;t++)
{
ch4=sc4.nextLine.CharAt(t);
//ch1=sc1.nextLine.CharAt(0);
//ch3=sc3.nextLine.CharAt(0);
System.out.print(str1.toCharArray(4)+str4.toCharArray(t)+str3.toCharArray(4));
}
}
}
}