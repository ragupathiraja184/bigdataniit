import java.util.*;
class addition
{
public static void main(String h[])
{
int a,b,c,d,sum=0;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
System.out.println("the numbers" +a +b +c +d);
if(a==13)
{
sum=c+d;
System.out.println(sum);
}
else if(b==13)
{
sum=d+a;
System.out.println(d+a);
}
else if(c==13)
{
sum=a+b;
System.out.println(sum);
}
else if(d==13)
{
sum=b+c;
System.out.println(sum);
}
else
{
sum=a+b+c+d;
System.out.println(sum);
}
}
}
