import java.lang.*;
import java.util.*;

class Program40
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Digits dobj=new Digits();
		boolean bRet=dobj.CheckPerfect(iValue);
		
		if(bRet==true)
			System.out.print("Tne number is perfect number");
		else
			System.out.print("Tne number is not perfect number");
	}
}

class Digits
{
	public boolean CheckPerfect(int iNo)
	{
		int iSumFactors=0;
		
		for(int iCnt=1; iCnt<=(iNo/2); iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				iSumFactors=iSumFactors+iCnt;
			}
		}
		
		if(iSumFactors==iNo)
			return true;
		else
			return false;
	}
}
