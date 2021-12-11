import java.lang.*;
import java.util.Scanner;

class program57
{
	public static void main(String arg[])
	{
		int Arr[]=new int[5];
		int iCnt=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Numbers");
		for(iCnt=0;iCnt<5;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		Demo dobj=new Demo();
		iRet=dobj.Addition(Arr,5);
		System.out.println("Addition is :"+iRet);
	}
}
class Demo
{
	public int Addition(int Brr[],int iSize)
	{
		int iCnt=0,iSum=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			iSum=iSum+Brr[iCnt];
		}
		return iSum;
	}
}