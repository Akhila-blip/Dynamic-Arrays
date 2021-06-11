import java.util.*;
public class SingleDimensional
{
public static void main(String[]args)
{
int[]a=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter Values");
for(int i=0;i<a.length;i++)
{
System.out.println("Enter"+i+"value");
a[i]=sc.nextInt();
}
for(int a1:a)
{
System.out.println(a1);
}
}
} 