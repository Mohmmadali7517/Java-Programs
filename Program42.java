import java.lang.*;
import java.util.Scanner;

class Program42
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Mathematics mobj=new Mathematics();
		mobj.DisplayTable(iValue);
	}
}

class Mathematics
{
	public void DisplayTable(int iNo)
	{
		if(iNo == 0)
		{
			return;
		}
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		for(int i=1; i<=10; i++)
		{
			System.out.println(iNo*i);
		}
	}
}

			