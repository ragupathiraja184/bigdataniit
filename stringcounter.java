import java.util.*;
class stringcounter
{
public static void main(String a[])
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.next();
System.out.print(s);
char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
for(int j=i+1;j<ch.length;j++)
{
while(j>i)
{int count=0;
if(ch[i]==ch[j])
{
System.out.println(ch[j]);
}
count++;
System.out.print(count);
}
}
}
}
