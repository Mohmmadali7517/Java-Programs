import java.lang.*;
import java.util.Scanner;

class program39
{
	public static void main(String Arg[])
	{
		Scanner sobj =new Scanner(System.in);
		int iLength=0,i=0,iRet=0;
		System.out.println("Enter Number of Elements");
		iLength=sobj.nextInt();
		int ptr[]=new int[iLength];
		System.out.println("Enter Elements");
		for(i=0;i<iLength;i++)
		{
			ptr[i]=sobj.nextInt();
		}
		Marvellous mobj=new Marvellous();
		iRet=mobj.SumOdd(ptr,iLength);
		System.out.println("Addition is :"+iRet);
	}
}
class Marvellous
{
	public int SumOdd(int Arr[],int iSize)
	{
		int i=0,iSum=0;
		for(i=0;i<iSize;i++)
		{
			if((Arr[i]%2)!=0)
			{
				iSum=iSum+Arr[i];
			}
		}
		return iSum;
	}
}