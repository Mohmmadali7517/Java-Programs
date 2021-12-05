/*3. Write a program which accept string from user and return 
difference between frequency of small characters and frequency of 
capital characters.
Input : MarvellouS
Output : 6 (8-2)*/

import java.util.*;

class StringX
{
	public int Display(String Str)
	{
		int iCap=0,iSmall=0;
		char Arr[]=Str.toCharArray();

		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='A'&&Arr[i]<='Z')
			{
				iCap++;

			}
			else
			{
				iSmall++;
			}
		}
		int iDiff=iSmall-iCap;
		return iDiff;
	}
}
class Program8
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter String");
		String str=sobj.nextLine();

		StringX obj=new StringX();
		int iRet=obj.Display(str);
		System.out.println("Diff of small and capital characters are :"+iRet);
	}
}