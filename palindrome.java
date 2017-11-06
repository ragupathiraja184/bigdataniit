import java.util.*;
class palindrome
{
public static void main(String h[])
{
int r,num,sum=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println(num);
int t=num;
while(num>0)
{
r=num%10;
num/=10;
sum=sum*10+r;
}
if(sum==t)
{
System.out.print(sum+ "is a palindrome");
}
else
{
System.out.print(sum+ "is not a palindrome");
}
}
}