import java.util.*;
class string1
{
public static void main(String h[])
{
String str1="java";
String str2="program";
str1=str1.concat(str2);
str2=str1.substring(0,(str1.length()-str2.length()));
str1=str1.substring(str2.length());
System.out.print("value of a:"+str1);
System.out.println("value of b" +str2);
}
}
