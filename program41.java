import java.lang.*;
import java.util.Scanner;

class program41
{
	public static void main(String Arg[])
	{
		int iLength=0,i=0,iRet=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		System.out.println("Enter Elements");
		for(i=0;i<iLength;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		CountEven obj=new CountEven();
		iRet=obj.CountEven(Arr,iLength);
		System.out.println("Number of Even elements are :"+iRet);
	}
}
class CountEven
{
	public int CountEven(int Brr[],int iSize)
	{
		int i=0,iCnt=0;
		for(i=0;i<iSize;i++)
		{
			if((Brr[i]%2)==0)
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}