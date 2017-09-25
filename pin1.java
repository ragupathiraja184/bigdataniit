import java.util.*;
class pin1
{
public static void main(String h[])
{
String s,s1;
int r1,r2,r3,n1;
Scanner sc=new Scanner(System.in);
s=sc.next();
System.out.println(s);
int num,n,sum,r;
Scanner ch=new Scanner(System.in);
char[] c=s.toCharArray();
Scanner us=new Scanner(System.in);
num=us.nextInt();
System.out.println(num);
for(int i=0;i<s.length();i++)
{
System.out.print(c[i]);
}
r1=num%10;
r2=num/10;
r3=r2%10;
r=r2/10;
sum=r1+r3+r;
n=sum/10+sum%10;
System.out.println();
System.out.print(n);
System.out.print(c[0]);
System.out.print(c[s.length()-1]);
switch(n)
{
case 0:
System.out.print("*");
break;
case 1:
System.out.print("!");
break;
case 2:
System.out.print("@");
break;
case 3:
System.out.print("#");
break;
case 4:
System.out.print("%");
break;
case 5:
System.out.print("^");
break;
case 6:
System.out.print("&");
break;
case 7:
System.out.print("<");
break;
case 8:
System.out.print(">");
break;
case 9:
System.out.print("?");
break;
}
}
}	


