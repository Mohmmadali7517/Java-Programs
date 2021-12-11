import java.lang.*;
import java.util.Scanner;

class program58
{
	public static void main(String Arg[])
	{
		int iLength=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		iLength=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		int iRet=0,iCnt=0;
		
		System.out.println("Enter Numbers :");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		Addition aobj=new Addition();
		iRet=aobj.Addition(Arr,iLength);
		System.out.println("Addition is :"+iRet);
	}
}
class Addition
{
	public int Addition(int brr[],int iSize)
	{
		int iCnt=0,iSum=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			iSum=iSum+brr[iCnt];
		}
		return iSum;
	}
}