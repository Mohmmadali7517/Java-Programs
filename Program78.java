/* Write Java program which accept two arrays from user and display
summation of each array.
Input : 2 9 7 5 2 3

9 3 5 5

Output : 28 22
*/

import java.util.*;

class MyArray
{
public void SumArray(int arr1[], int arr2[])
{
// Traverse Both the array and display its summation
	int i=0,iSum1=0,iSum2=0;
	System.out.println("Summation of both the array are :");
	for(i=0;i<arr1.length;i++)
	{
		iSum1=iSum1+arr1[i];
	}
	System.out.println();
	for(i=0;i<arr2.length;i++)
	{
		iSum2=iSum2+arr2[i];
	}
	System.out.println(iSum1+"\t"+iSum2+"\t");
}
}

class Program78
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
		mobj.SumArray(p,q);

	}
}