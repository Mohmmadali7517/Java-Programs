import java.lang.*;
import java.util.Scanner;

class Program31
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
		int iCounter=0;
		while(iNo!=0)
		{
			iNo=iNo/10;
			iCounter++;
		}
		
		return iCounter;
	}
}