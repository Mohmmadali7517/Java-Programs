/*Write a java program which accept two array from user and copy
the contents of that array into another array in reverse order and
return new array.
*/
import java.util.*;

class MyArray
{
public void CopyArrayRev (int arr[])
{
// Allocate memory for new array using malloc
// Copy the contents from input array into new array in reverse order
// Return new array
	int brr[]=new int[arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--)
	{
		brr[j]=arr[i];
		j++;
	}
	System.out.println("Elements in new array are :");
	for(int i=0;i<brr.length;i++)
	{
		System.out.print(brr[i]+"\t");
	}
}
}

class Program81
{
	public static void main(String args[]) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of elements ");
		int iSize=sobj.nextInt();

		int p[]=new int[iSize];

		System.out.println("Elements in array are :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.nextInt();
		}

		MyArray mobj=new MyArray();
		mobj.CopyArrayRev(p);
		
	}
}