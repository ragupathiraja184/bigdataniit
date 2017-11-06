import java.util.*;
class student13
{
public static void main(String []args)
{int num=5;
int[] marks=new int[num];
Scanner sc1=new Scanner(System.in);
String[] arr=new String[num];
Scanner sc=new Scanner(System.in);
try
{
for(int i=0;i<=num;i++)
{
//Scanner sc=new Scanner(System.in);
arr[i]=sc.next();
System.out.println("the student name is"+arr[i]);
}
}
catch(Exception e)
{
System.out.print("enter the limited value");
}
for(int i=0;i<num;i++)
{
System.out.println("the student name is"+arr[i]);
}
for(int i=0;i<num;i++)
{
marks[i]=sc1.nextInt();
System.out.println("the student name is"+arr[i]);
}
for(int i=0;i<num;i++)
{
marks[i]=sc1.nextInt();
System.out.println("the student marks is"+marks[i]);
}
for(int i=0;i<num;i++)
{
System.out.println("the student marks is"+marks[i]);
}
}
}