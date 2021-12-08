import java.lang.*;
import java.util.*;

class program23
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo=sobj.nextInt();
		
		Factorial obj=new Factorial();
		int iRet=obj.Factorial(iNo);
		System.out.println("Factorial is :"+iRet);
	}
}
class Factorial
{
	public int Factorial(int iValue)
	{
		int iFact=1;
		if(iValue<0)
		{
			iValue=-iValue;
		}
		int iCnt=1;
		while(iCnt<=iValue)
		{
			iFact=iFact*iCnt;
			iCnt++;
		}
		return iFact;
	}
}