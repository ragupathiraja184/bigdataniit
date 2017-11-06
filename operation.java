import java.util.*;
class operation
{
public static void main(String h[])
{
char n;
int a=5;
int b=10;
Scanner sc=new Scanner(System.in);
n=sc.nextcharAt(0);
System.out.print(n);
switch(0)
{
case '*':
c=a*b;
System.out.println(c);
break;
case '+':
c=a+b;
System.out.println(c);
break;
case '-':
c=a-b;
System.out.println(c);
break;
case '/':
c=a/b;
System.out.println(c);
break;
case '%':
c=a%b;
System.out.println(c);
break;
default:
System.out.print("enter the correct number");
}
}
}
