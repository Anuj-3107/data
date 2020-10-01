import java.io.*;
import java.util.*;
public class binarysearch
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in the list: ");
		int n =  scan.nextInt();
		int[] a;
		a = new int[n];
		System.out.println("Enter the elements of the list in increasing order ");
		int i = 0;
		for(i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.print("Enter the element you want to search: ");
		int x = scan.nextInt();
		int left=0,right = n-1, middle;
		while (left<=right)
		{
			middle = (left+right)/2;
			if(a[middle] == x)
			{
				System.out.println("The element is present at position " + (middle+1));
				break;
			}
			else if(a[middle]>x)
			{
				right = middle-1;
			}
			else
			{
				left = middle + 1;
			}
		}
		if (left>right)
		{
			System.out.println("The element is not present in the list.");
		}
	}
} 
