import java.lang.*;
import java.util.Scanner;

class Program37
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Digits dobj=new Digits();
		int iRet=dobj.Reverse(iValue);
		
		System.out.print("Reverse of "+iValue+ " is "+iRet);
	}
}

class Digits
{
	public int Reverse(int iNo)
	{
		int iDigit=0, iReverse=0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		while(iNo!=0)
		{
			iDigit=iNo%10;
			System.out.println(iDigit);
			iReverse=iReverse*10+iDigit;
			iNo=iNo/10;
		}
		return iReverse;
	}
}
	