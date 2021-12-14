/*5. Write Java program which accept array from user and display below
pattern.
Input : 8 9 7 6 4 2 4
Output :

* * * * * * * *
* * * * * *
* * * *
* *
* * * *

*/

import java.util.*;

class MyArray
{
public void Pattern (int arr[])
{

// Logic
	for(int i=0;i<arr.length;i++)
	{
		while(arr[i]!=0)
		{		
		    System.out.print("*\t");
		    arr[i]--;
		}
		System.out.println();

	}

}
}
class Program91
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number of elements in array :");
		int iSize=sobj.nextInt();

		int p[]=new int[iSize];

		System.out.println("elements in array are :");

		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.nextInt();
		}

		MyArray mobj=new MyArray();
		mobj.Pattern(p);

	}
}