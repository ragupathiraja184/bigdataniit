import java.util.*;
class series
{
public static void main(String h[])
{
int n,i,a=0,b=1,c=0;
n=Integer.parseInt(args[0]);
System.out.print(""+a+""+b);
for(i=1;i<=(n-2);i++)
{
c=a+b;
System.out.print(""+c);
a=b;
b=c;
}
}
}