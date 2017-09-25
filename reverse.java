import java.util.*;
class reverse
{
public static void main(String h[])
{
int n=423,r,s=0;
while(n>0)
{
int t=n;
r=n%10;
n=n/10;
s=s*10+r;
}
System.out.println(s);
}
}
