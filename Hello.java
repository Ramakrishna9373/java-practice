import java .util.*;
class Hello
{
public static void main(String[] args){
 Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int k=s.nextInt();
int sum=0;
int q[]=new int[k];
System.out.println("enter array elements");
for(int i=0;i<q.length;i++)
{
    q[i]=s.nextInt();
System.out.println(q[i]);
sum+=q[i];}
System.out.println("sum"+sum/k);
}
}