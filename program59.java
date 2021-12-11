import java.lang.*;
import java.util.Scanner;

class program59
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int iLength=0,i=0;
		System.out.println("Enter the number of Elements");
		iLength=sobj.nextInt();
		int ptr[]=new int[iLength];
		float fRet=0.0f;
		System.out.println("Enter the Elements");
		for(i=0;i<iLength;i++)
		{
			ptr[i]=sobj.nextInt();
		}
		Average aobj=new Average();
		fRet=aobj.Average(ptr,iLength);
		System.out.println("Average is :"+fRet);
	}
}

class Average
{
	public float Average(int brr[],int iSize)
	{
		int iSum=0,i=0;
		float fResult=0.0f;
		for(i=0;i<iSize;i++)
		{
			iSum=iSum+brr[i];
		}
		fResult=(float)iSum/(float)iSize;
		return fResult;
	}
}