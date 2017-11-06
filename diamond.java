import java.util.*;
class diamond
{
public static void main(String h[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("enter the rows" +n);
int starcounter=1;
int spacecounter=n-1;
for(int i=1;i<=n;i++)
{
System.out.println();
for(int j=1;j<=spacecounter;j++)
{
System.out.print(" ");
}
for(int k=1;k<=starcounter;k++)
{
System.out.print("*");
}
spacecounter--;
starcounter=starcounter+2;
}
}
}

