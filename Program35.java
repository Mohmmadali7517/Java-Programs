import java.lang.*;
import java.util.Scanner;

class Program35
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Digits dobj=new Digits();
		int iRet=dobj.EvenSum(iValue);
		
		System.out.print("Sum of even digits is:"+iRet);
	}
}

class Digits
{
	public int EvenSum(int iNo)
	{
		int iSum = 0, iDigit = 0;

		if(iNo < 0)
		{   iNo = -iNo; }
		
		while(iNo!=0)      // O(N)     Where N is number of digits         (N >= 0)
		{
			iDigit = iNo % 10;
			if((iDigit % 2) == 0)
			{
				iSum = iSum + iDigit;
			}
			iNo = iNo / 10;
		}
		return iSum;
	}
}