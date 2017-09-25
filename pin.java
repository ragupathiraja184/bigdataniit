import java.util.*;
class pin
{
public static void main(String h[])
{
//int count=1;
int temp;
String s;
Scanner sc=new Scanner(System.in);
s=sc.next();
System.out.println(s);
char []c=s.toCharArray();
for(int i=0;i<=s.length()-2;i++)
{
//System.out.print(c[i]);
for(int j=i+1;j<=s.length()-1;j++)
{
if(c[i]==c[j])
{
int count=0;
//System.out.print(c[i]);//+"times")
/*temp=(int)c[i];
temp=temp-32;
c[i]=(char)temp;*/
//count=count+1;
//System.out.print(count);
System.out.print(c[i]);
count++;
System.out.print(count);
System.out.println();
break;
}
}
}
}
}

