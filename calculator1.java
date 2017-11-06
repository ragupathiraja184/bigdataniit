import java.util.*;
class calculator1
{
void add(int a,int b)
{
int c;
c=a+b;
}
void sub(int a,int b)
{
int c;
c=a-b;
}
void multiply(int a,int b)
{
int c;
c=a*b;
}
void divide(int a,int b)
{
int c;
c=a/b;
}
public static void main(String h[])
{
calculator1 c=new calculator1();
c.add(3,2);
System.out.print("addition is"+ c);
c.sub(4,3);
System.out.print("subtraction is"+ c);
c.multiply(5,6);
System.out.print("multiply is"+ c);
c.divide(4,2);
System.out.print("divide is"+ c);
}
}




