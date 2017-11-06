import java.util.*;
class stringcollect
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
if(ch[i]==ch[j])
{
System.out.println(ch[j]);
}
}
}
}
}
