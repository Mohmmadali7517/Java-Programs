/* Write Java program which accept two arrays from user and display
even contents of each array.
Input : 2 9 6 5 2 3
45 6 12 18 23 4

Output : 2 6 2
6 12 18 4


*/

import java.util.*;

class MyArray
{
public void DisplayEven(int arr1[], int arr2[])
{
// Traverse Both the array and display its even contents
	int i=0;
	System.out.println("Even Elements in both the array are :");
	for(i=0;i<arr1.length;i++)
	{
		if((arr1[i]%2)==0)
		{
			System.out.print(arr1[i]+"\t");
		}
	}
	System.out.println();
	for(i=0;i<arr2.length;i++)
	{
		if((arr2[i]%2)==0)
		{
			System.out.print(arr2[i]+"\t");
		}
	}
}
}

class Program75
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int i=0;

		System.out.println("Enter the elements in Array1 :");
		int iSize1=sobj.nextInt();

		int p[]=new int[iSize1];

		System.out.println("elements in Array1 are :");
		for (i=0;i<iSize1;i++) 
		{
			p[i]=sobj.nextInt();
			
		}

		System.out.println("Enter the elements in Array2 :");
		int iSize2=sobj.nextInt();

		int q[]=new int[iSize2];

		System.out.println("elements in Array2 are :");
		for (i=0;i<iSize2;i++) 
		{
			q[i]=sobj.nextInt();
			
		}

		MyArray mobj=new MyArray();
		mobj.DisplayEven(p,q);

	}
}