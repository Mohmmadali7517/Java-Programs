/*Write a java program which accept two array from user and copy
the contents of that array into another array and return new array.
class MyArray
{
public int[] CopyArray (int arr[])
{
// Allocate memory for new array using malloc
// Copy the contents from input array into new array
// Return base address of dynamic memory
}
}
*/
import java.util.*;
class MyArray
{
public void CopyArray(int arr[])
{
// Allocate memory for new array using malloc
// Copy the contents from input array into new array
// Return base address of dynamic memory
	int p[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		p[i]=arr[i];
	}

	System.out.println("Elements in the Another array are :");

	for(int i=0;i<p.length;i++)
	{
		System.out.print(p[i]+"\t");
	}
}
}

class Program82
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

		MyArray mobj=new MyArray();
		mobj.CopyArray(p);

	}
}