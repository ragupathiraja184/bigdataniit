import java.util.*;
class vehichle
{
public void accelerate()
{
int a,b;
}
protected void speed()
{
int c,d
}
}
class car extends vehichle
{
protected void speed()
{
int a=22;
int b=33;
int speed=a*b;
System.out.println(speed);
}
}
class scooter
{
int h=8;
void accelerate()
{
int a=32;
int b=33;
int s=10;
accelerate=a*b*s;
System.out.println(accelerate);
}
}
public static void main(String h[])
{
scooter s=new scooter();
s.accelerate();
car c=new car();
c.speed();
}

