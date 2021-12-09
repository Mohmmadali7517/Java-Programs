import java.lang.*;
import java.util.Scanner;

class Program34
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Digits dobj= new Digits();
		int iRet=dobj.EvenDigits(iValue);
		
		System.out.print("Number of even digits are:"+iRet);
	}
}

class Digits
{
	public int EvenDigits(int iNo)
	{
		int iCounter=0, iDigit=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit%2)==0)
				iCounter++;
			iNo=iNo/10;
		}
		
		return iCounter;
	}
}