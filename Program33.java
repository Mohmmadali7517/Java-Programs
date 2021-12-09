import java.lang.*;
import java.util.Scanner;

class Program33
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Mathematics mobj=new Mathematics();
		int iRet=mobj.CountDigits(iValue);
		System.out.print("The given number has " +iRet+ " digits");
	}
}

class Mathematics
{
	public int CountDigits(int iNo)
	{
		int iCnt = 0;
		if(iNo == 0)
		{
			return 1;
		}
		if(iNo < 0)     // Input updator
		{
			iNo = -iNo;
		}
		while(iNo > 0)
		{
			iCnt++;     // iCnt = iCnt + 1;
			iNo = iNo / 10;
		}
		return iCnt;
		}
}