public class ThreeDimensionalArray
{
public static void main(String[]args)
{
int[][][]array=new int[3][3][3];
for(int row=0;row<array.length;row++)
{
for(int column=0;column<array[row].length;column++)
{
for(int th=0;th<array[row][column].length;th++)
{
array[row][column][th]=10;
}
}
}
for(int row=0;row<array.length;row++)
{

for(int column=0;column<array[row].length;column++)
{
for(int th=0;th<array[row][column].length;th++)
{
System.out.print(array[row][column][th]+" ");
}
System.out.print("****");
}
System.out.println("");
}
for(int[][] sarr:array){
for(int[] ele:sarr){
for(int el:ele){
System.out.print(el+" ");
}
System.out.print("****");
}
System.out.println();
}
}
}
