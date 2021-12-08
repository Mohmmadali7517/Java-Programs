import java.lang.*;
import java.util.*;

class program29
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo=sobj.nextInt();
		Display dobj=new Display();
		
		int iRet=dobj.Display(iNo);
		
		System.out.println("Addition of Digits is:"+iRet);
	}
}
class Display
{
	public int Display(int iValue)
	{
		int iDigit=0,iAdd=0;
		if(iValue<0)
		{
			iValue=-iValue;
		}
		while(iValue!=0)
		{
			iDigit=iValue%10;
			iAdd=iAdd+iDigit;
			iValue=iValue/10;
		}
		return iAdd;
	}
}