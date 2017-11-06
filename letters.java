import java.util.*;
class letters
{
/*String str1,str2,str3,str4;
Scanner sc=new Scanner(System.in);
System.out.print(str1);
}*/
public static void main(String h[])
{
String str1,str2,str3,str4;
Scanner sc=new Scanner(System.in);
str1=sc.next();
System.out.print(str1);
System.out.println();
char[] ch=str1.toCharArray();
str2=sc.next();
System.out.print(str2);
System.out.println();
char[] ch1=str2.toCharArray();
str3=sc.next();
char[] ch3=str3.toCharArray();
System.out.print(str3);
System.out.println();
str4=sc.next();
char[] ch4=str4.toCharArray();
System.out.print(str4);
System.out.println();
System.out.print("the square string is\n");
/*for(int i=0;i<2;i++)
{
System.out.println(ch[i]);
}*/
for(int i=0;i<5;i++)
{
System.out.print(ch[i]);
}
System.out.println();
//System.out.print("    ");
{
for(int i=1;i<4;i++)
{
//System.out.print("    ");
System.out.println(ch1[i]+ "   "+ ch3[i]);
//System.out.println();
}
//System.out.println();
for(int i=0;i<5;i++)
{
System.out.print(ch4[i]);
}
}
}
}