/*2. Write java program which accept array from user and replace each 
member with summation of its digit.
Input : 89 687 56 549 87 9
Output : 17 21 11 18 15 9
*/

import java.util.*;

class MyArray
{
public void SumArray(int arr[])
{
// Traverse array 
// Apply the logi
// Replace that summation at same place
	int i=0,idigit=0,iSum=0;
	for(i=0;i<arr.length;i++)
	{
		iSum=0;
		while(arr[i]!=0)
		{
			idigit=arr[i]%10;
			iSum=iSum+idigit;
			arr[i]=arr[i]/10;
		}
		arr[i]=iSum;
	}

	System.out.println("Summation of digit is :");
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}

}
}

class Program84
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Number of elements in array are :");
		int iSize=sobj.nextInt();

		int p[]=new int[iSize];

		System.out.println("elements in array are :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.nextInt();

		}
		MyArray mobj=new MyArray();

		mobj.SumArray(p);
	}
}