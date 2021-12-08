import java.lang.*;
import java.util.*;

class program22
{
	public static void main(String arg[])
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo=sobj.nextInt();
		CheckEven obj=new CheckEven();
		boolean bRet=obj.CheckEven(iNo);
		if(bRet==true)
		{
			System.out.println(+iNo+" is Even Number");
		}
		else
		{
			System.out.println(+iNo+" is number not even");
		}
	}
}

class CheckEven
{
	public boolean CheckEven(int iValue)
	{
		if((iValue%2)==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}