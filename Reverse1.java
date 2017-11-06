import java.util.*;
public class Reverse1
{
int i,c=0,res;
void StringReverse(String s)
{
char ch[]=new char[s.length];
for(i=0;i<s.length;i++)
{
ch[i]=s.toCharArray();
}
for(i=s.length-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}
public static void main(String []args)
{
String s;
//Reverse1 r=new Reverse1();
s.StringReverse("reverse");
//System.out.print(s);
}
}