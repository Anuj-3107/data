 import java.util.*;
class SelectionSort
{
public static void selectionsort(int array[],int k)
{
 for(int i=0;i<k;i++)
{
 int min = i;
 for( int j=i+1;j<k;j++)
 {
 if(array[j]<array[j+1])
 {
 min=j;
 }
 }
}
if(min!=i)
{
 //swap (array[i],array[min])
int temp;
 temp=array[min];
 array[min]=array[i];
array[i]=temp;
 }
}
public static void main(String [] args)
{
 Scanner in=new Scanner(System.in);
 System.out.println(“Enter the no. of data you want to enter”);
 int k=in.nextInt();
int array[] =new int[];
System.out.println(“Enter the data you want to enter in the array”);
for(int i=0;i<k;i++)
{
 array[i]=in.nextInt;
}
//passing the array and integer k
 selectionsort(array,k);
for(int i=0;i<k;i++)
System.out.println(array[i] +“ ”);}
 }
}