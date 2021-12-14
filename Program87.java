/*1. Write Java program which accept array of characters from user and
replace each capital character with its corresponding small character.
Input : b N j B R b A d G G
Output : b n j b r b a d g g
*/

import java.util.*;

class MyArray
{
public void ArrayReplace(char arr[])
{
// Logic
	System.out.println("Small characters are :");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='A' && arr[i]<='Z')
		{
			arr[i]=(char)(arr[i]+32);
		}
		System.out.print(arr[i]+"\t");
	}

}
}

class Program87
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number of elements ");
		int iSize=sobj.nextInt();

		char p[]=new char[iSize];

		System.out.println("Enter the elements :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.next().charAt(0);
		}

		MyArray mobj=new MyArray();
		mobj.ArrayReplace(p);
	}
}