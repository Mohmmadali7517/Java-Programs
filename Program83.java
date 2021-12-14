/*1. Write java program which accept array from user and reverse each 
number of that array.
Input : 89 687 56 549 87 9
Output : 98 786 65 945 78 9
*/

import java.lang.*;
import java.util.*;

class MyArray
{
public void ReverseArray(int arr[])
{
// Traverse array 
// Apply the logic to reverse the number
// Replace that reverse number at same place
	int i=0,iDigit=0,iRev=0;
	for(i=0;i<arr.length;i++)
	{
		iRev=0;
		int iTemp=arr[i];
		while(iTemp!=0)
		{
			iDigit=iTemp%10;
			iRev=(iRev*10)+iDigit;
			iTemp=iTemp/10;
		}
		arr[i]=iRev;
	}
	System.out.println("Reverse array is :");
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
class Program83
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number of Elements: ");
		int iSize=sobj.nextInt();

		int p[]=new int[iSize];

		System.out.println("Elements in array are :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.nextInt();

		}

		MyArray mobj=new MyArray();
		mobj.ReverseArray(p);

	}
}