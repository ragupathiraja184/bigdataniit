import java.util.*;
class usermaincode
{
int d;
int accept(int a,int b,int c)
{
System.out.print("the three numbers are"+ a+ b+ c);
if(a>b&&a>c&&b<c)
{
d=a+b;
return d;
}
if(a>b&&a>c&&b>c)
{
d=a+c;
return d;
}
if(b>a&&b>c&&a<c)
{
d=b+a;
return d;
}
if(c>a&&c>b&&a<b)
{
d=c+a;
return d;
}
if(c>a&&c>b&&b<a)
{
d=c+b;
return d;
}
//return 0;
public static void main(String h[])
{
//int e;
usermaincode s=new usermaincode();
//e=s.accept(12,13,19);
System.out.print(d);
s.accept(12,13,19)
}
}