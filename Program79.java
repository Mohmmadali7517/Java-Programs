/*Write a java program which accept two arrays from user and return
difference between summation of arrays.
Input : 2 9 7 5 2 3

9 3 5 5

Output : 6
class MyArray
{
public int DiffArray(int arr1[], int arr2[])
{
// Traverse Both the array and calculate its summation
// Return difference between summation
}
}*/
import java.util.*;

class MyArray
{
public void DiffArray(int arr1[], int arr2[])
{
// Traverse Both the array and calculate its summation
// Return difference between summation
	int i=0,iSum1=0,iSum2=0;
	for(i=0;i<arr1.length;i++)
	{
		iSum1=iSum1+arr1[i];
	}
	System.out.println();
	for(i=0;i<arr2.length;i++)
	{
		iSum2=iSum2+arr2[i];
	}
	int iSum=iSum1-iSum2;
	System.out.println("Difference bettwen both the array is :"+iSum);
}
}

class Program79
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
		mobj.DiffArray(p,q);

	}
}