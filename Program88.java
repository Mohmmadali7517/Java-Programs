/*2. Write Java program which accept array of characters from user and
replace each capital character with its corresponding small character.
Input : b N e B R b A i G i
Output : 4
class MyArray
{
int ArrayCountVowels(char arr[])
{
}
}*/

import java.util.*;

class MyArray
{
public int ArrayCountVowels(char arr[])
{
	int iCnt=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
		{
			iCnt++;
		}
	}
	return iCnt;

}
}

class Program88
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
		int iRet=mobj.ArrayCountVowels(p);
		System.out.println("Number of vowels in array are :"+iRet);
	}
}