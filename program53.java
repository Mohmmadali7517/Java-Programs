import java.lang.*;
import java.util.*;

class program53
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number");
		int iValue1=sobj.nextInt();
		System.out.println("Enter second Number");
		int iValue2=sobj.nextInt();
		
		Minimum mobj=new Minimum();
		int iRet=mobj.Minimum(iValue1,iValue2);
		System.out.println("Minimum number is"+iRet);
	}
}
class Minimum
{
	public int Minimum(int iNo1,int iNo2)
	{
		if(iNo1<iNo2)
		{
			return iNo1;
		}
		else
		{
			return iNo2;
		}
	}
}