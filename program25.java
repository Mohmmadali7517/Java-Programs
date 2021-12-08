import java.lang.*;
import java.util.*;

class program25
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo=sobj.nextInt();
		
		DisplayFactors obj=new DisplayFactors();
		obj.DisplayFactors(iNo);
	}
}

class DisplayFactors
{
	public void DisplayFactors(int iValue)
	{
		if(iValue<0)
		{
			iValue=-iValue;
		}
		for(int iCnt=1;iCnt<=iValue/2;iCnt++)
		{
			if((iValue%iCnt)==0)
			{
				System.out.println(iCnt);
			}
		}
	}
}