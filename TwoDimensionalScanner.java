import java.util.Scanner;
public class TwoDimensionalScanner
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int array[][]=new int[3][3];
for(int row=0;row<array.length;row++)
{
for(int column=0;column<array[row].length;column++)
{
array[row][column]=sc.nextInt();
}
}
System.out.print("Elements in array are:\n");
for(int row=0;row<array.length;row++)
{
for(int column=0;column<array[row].length;column++)
{
System.out.print(array[row][column]+" ");
}
System.out.println();
}
for(int[] sarr:array)
{
for(int ele:sarr)
{
System.out.println(ele+"");
}
System.out.println();
}
}
}