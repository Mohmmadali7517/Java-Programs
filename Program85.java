/*4. Write java program which accept array of characters from user and 
count number of capital characters.
Input : b N j B R b A d G G
Output : 6
*/

import java.util.*;

class MyArray
{
int ArrayCapital(char arr[])
{
// Traverse array and count capital characters
	int iCnt=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='A'&&arr[i]<='Z')
		{
			iCnt++;
		}
	}
	return iCnt;
}
}

class Program85
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Number of Elements in array are :");
		int iSize=sobj.nextInt();

		char p[]=new char[iSize];

		System.out.println("Elements are :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.next().charAt(0);   
		}

		MyArray mobj=new MyArray();
		int iRet=mobj.ArrayCapital(p);
		System.out.println("Capital letters in array are :"+iRet);

	}
}