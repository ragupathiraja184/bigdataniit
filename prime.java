import java.util.*;
class prime
{
public static void main(String h[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
boolean isprime=true;
if(num%2==0)
{isprime=false;
System.out.println("the number is not aprime");
}
for(int i=0;i<num/2;i++)
{
if(num%i==0)
{
System.out.println("the number is not aprime");
}
elseif(isprime==true)
{
System.out.println("thye number is prime" +num);
//break;
}
}
}
}
