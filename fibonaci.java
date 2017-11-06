import java.util.*;
class fibonaci
{
public static void main(String h[])
{
int num;
int sum[]={0,1}; 
//int sum[2]=1;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.print(sum[0]+" "+sum[1]);
for(int i=2;i<=num-1;i++)
{
sum[i]=sum[i]+sum[i+1];
System.out.print(sum[i]);
sum[i]=sum[i+1];
sum[i+1]=sum[i];
}
}
}