import java.lang.*;
import java.util.*;

class program28
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int iNo=sobj.nextInt();
		
		Display dobj=new Display();
		dobj.Display(iNo);
	}
}

class Display
{
	public void Display(int iValue)
	{
		int iDigit=0;
		while(iValue>0)
		{
			iDigit=iValue%10;
			System.out.println(iDigit);
			iValue=iValue/10;
		}
	}
}
		