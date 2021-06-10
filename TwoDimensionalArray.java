public class TwoDimensionalArray
{
public static void main(String[]args)
{
int[][] array=new int[3][3];

for(int row=0;row<array.length;row++){

for(int column=0;column<array[row].length;column++){
array[row][column]=10;
}
}

for(int row=0;row<array.length;row++){

for(int column=0;column<array[row].length;column++){
System.out.print(array[row][column]+" ");
}
System.out.println();
}
for(int[] sarr:array){
for(int ele:sarr){
System.out.print(ele+" ");
}
System.out.println();
}
}
}

