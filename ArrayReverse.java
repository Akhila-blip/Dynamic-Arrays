import java.util.Scanner;
class ArrayReverse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter length array: ");
int length=sc.nextInt();
int[] array=new int[length];
for(int i=0;i<length;i++)
{
array[i]=sc.nextInt();
}
for(int i=array.length-1;i>=0;i--)
{
System.out.println(array[i]);
}
}
}