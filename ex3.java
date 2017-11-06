import java.util.*;
import java.io.*;
public class ex3
{
public static void main(String []args)
{
String s1,s2,s3,s4,s5;
Scanner sc1=new Scanner(System.in);
s1=sc1.next();
System.out.print(s1);
System.out.println();
char []ch1=s1.toCharArray();
Scanner sc2=new Scanner(System.in);
s2=sc2.next();
System.out.print(s2);
System.out.println();
char []ch2=s2.toCharArray();
Scanner sc3=new Scanner(System.in);
s3=sc3.next();
System.out.print(s3);
System.out.println();
char []ch3=s3.toCharArray();
System.out.print(s3);
System.out.println();
Scanner sc4=new Scanner(System.in);
s4=sc4.next();
System.out.print(s4);
System.out.println();
char []ch4=s4.toCharArray();
Scanner sc5=new Scanner(System.in);
s5=sc5.next();
System.out.print(s5);
System.out.println();
char []ch5=s5.toCharArray();
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
for(int m=0;m<5;m++)
{
ch4[m]=sc5.nextCharAt(m);
System.out.print(ch5[m]);
}
}
}