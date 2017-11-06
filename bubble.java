import java.util.*;
public class bubble
{
public static void bubble(String []ara)
{
int temp=0;
//int arr[];
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=1;j<(n-1);j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
}
}
public static void main(String[] args)
{
int arr[]={3,5,6,8,9,12,34,56};
System.out.println("array before sort");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+"");}
}
System.out.println("array after sort");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+"");
}
}
}
}
