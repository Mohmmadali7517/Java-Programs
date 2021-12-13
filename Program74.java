/* Write Java program which accept two arrays from user and display
contents of each array.
Input : 2 9 7 5 2 3

9 3 5 5

Output : 2 9 7 5 2 3

9 3 5 5

*/

import java.util.*;

class MyArray
{
public void Display(int arr1[], int arr2[])
{
// Traverse Both the array and display its contents
	int i=0;
	System.out.println("Elements in the array are :");

	for(i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+"\t");
	}
	System.out.println();
	for (i=0;i<arr2.length ;i++ )
	{
		System.out.print(arr2[i]+"\t");
		
	}
}
}

class Program74
{
	public static void main(String Arg[])
	{
		int i=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the Elements in the Array1");
		int iSize1=sobj.nextInt();

		System.out.println("Enter the Elements in the Array2");
		int iSize2=sobj.nextInt();

		int p[]=new int[iSize1];

		System.out.println("Elements in Array1 are :");
		for(i=0;i<iSize1;i++)
		{
			p[i]=sobj.nextInt();
		}

		int q[]=new int[iSize2];

		System.out.println("Elements in Array2 are :");
		for(i=0;i<iSize2;i++)
		{
			q[i]=sobj.nextInt();
		}

		MyArray mobj=new MyArray();
		mobj.Display(p,q);


	}
}