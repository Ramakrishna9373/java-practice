import java.util.*;
class Array
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
int [][]a=new int[3][3];
System.out.println("array elements");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<i;j++)
{
int k[]=s.nextInt();

System.out.println(k);
}
}
}
}