import java.lang.*;
import java.util.*;
class program21
{
	public static void main(String Arg[])
	{
		int iLength=0,i=0,iRet=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		iLength=sobj.nextInt();
		int Str[]=new int[iLength];
		System.out.println("Enter Elements");
		for(i=0;i<iLength;i++)
		{
			Str[i]=sobj.nextInt();
		}
		Marvellous mobj=new Marvellous();
		iRet=mobj.Count(Str,iLength);
		System.out.println("No greater than 10 is :"+iRet);
	}	
}
class Marvellous
{
	public int Count(int Arr[],int iSize)
	{
		int iCnt=0,i=0;
		for(i=0;i<iSize;i++)
		{
			if(Arr[i]>10)
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
