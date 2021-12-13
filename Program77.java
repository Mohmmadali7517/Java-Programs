/*4. Write Java program which accept two arrays from user and form
new array which is combination of contents of first and second array.
Input : 12 57 28 3

99 23 54 58 6 67

Output : 12 57 28 3 99 23 54 58 6 67

*/

import java.util.*;

class MyArray
{
public void ArrayConcate(int arr1[], int iSize1, int arr2[], int iSize2)
{
// Allocate dynamic memory to store contents of both arrays
// Traverse Both the array and copy contents into new array
// Return new array
	Scanner sobj=new Scanner(System.in);
	int i=0;
	int iSize=iSize2+iSize1;

	int Brr[]=new int[iSize];
	for(i=0;i<arr1.length;i++)
	{
		Brr[i]=arr1[i];
	}
	for(i=0;i<arr2.length;i++)
	{
		Brr[iSize1]=arr2[i];
		iSize1++;
	}

	System.out.println("elements in the new array are :");
	for (i=0;i<Brr.length;i++)
	{
		System.out.print(Brr[i]+"\t");
	}

}
}

class Program77
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
		mobj.ArrayConcate(p,iSize1,q,iSize2);

	}
}