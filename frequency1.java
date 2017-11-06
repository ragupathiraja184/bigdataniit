import java.util.*;
class frequency1
{
public static void main(String h[])
{
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
Scanner sc1=new Scanner(System.in);
int arr[]=new int[sc1.nextInt()];
for(int i=0;i<num-1;i++)
{
int count=0;
for(int j=1;j<num;j++)
{
while(j>i)
{
if(arr[i]==arr[j])
{
System.out.print(arr[i]);
count++;
}
System.out.println(count);
break;
}
}
}
}
}