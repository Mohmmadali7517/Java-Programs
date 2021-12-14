/*4. Write Java program which accept array of characters from user and
return difference between frequency of capital and frequency of small
characters.
Input : b N e B R b A I O G i
Output : 3 (7 - 4)
class MyArray
{
int Diffrence(char arr[])
{
}
}*/

import java.util.*;

class MyArray
{
public int Diffrence(char arr[])
{
// Logic
	int iCnt=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='A' && arr[i]<='Z')
		{
			iCnt++;
		}
		else if(arr[i]>='a' && arr[i]<='z')
		{
			iCnt--;
		}
		
	}
	return iCnt;

}
}

class Program90
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
		int iRet=mobj.Diffrence(p);
		System.out.println("Difference of capital and small letters are :"+iRet);
	}
}