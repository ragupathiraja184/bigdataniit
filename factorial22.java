class factorial22
{
public static void main(String h[])
{
int i,j,k;
for(i=0;i<3;i++)
{
for(j=0;j<i;j++)
{
for(k=3;k>j;k--;)
{
System.out.print(" ");
}
System.out.print("*");
}
}
}
}