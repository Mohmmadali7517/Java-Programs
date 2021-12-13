/* Write a java program which accept two two arrays from user and
display minimum element of each array.
Input : 2 9 7 5 2 3

9 3 5 5

Output : 2 3
*/

import java.util.*;

class MyArray
{
public void MinArray(int arr1[], int arr2[])
{
// Traverse Both the array and display its small no
	int i=0;
	int min1=arr1[i];
	for(i=0;i<arr1.length;i++)
	{
		if(arr1[i]<min1)
		{
			min1=arr1[i];
		}
	}
	i=0;
	int min2=arr2[i];
	for(i=0;i<arr2.length;i++)
	{
		if(arr2[i]<min2)
		{
			min2=arr2[i];
		}
	}

	System.out.println("minimum element of each array are :"+min1+"\t"+min2);

}
}

class Program80
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
		mobj.MinArray(p,q);

	}
}