import java.lang.*;
import java.util.Scanner;

class Program45
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iBase=sobj.nextInt();
		System.out.print("Enter the Power:");
		int iPower=sobj.nextInt();
		
		Mathematics mobj=new Mathematics();
		int iRet=mobj.Power(iBase,iPower);
		
		System.out.print("The result is:"+iRet);
	}
}

class Mathematics
{
	public int Power(int x, int y)
	{
		int iMult=1;
		if(x < 0)
		{   x = -x; }
		if(y < 0)
		{   y = -y; }
		for(int i=1; i<=y; i++)
		{
			iMult=iMult*x;
		}
		
		return iMult;
	}
}

		