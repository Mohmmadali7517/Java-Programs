import java.lang.*;
import java.util.Scanner;

class Program50
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Display dobj=new Display();
		dobj.Display(iValue);
	}
}

class Display
{
	public void Display(int iNo)
	{
		for(int iCnt=1; iCnt<=iNo; iCnt++)
		{
			if((iCnt%2)==0)
				System.out.print("#\t");
			else
				System.out.print("*\t");
		}
	}
}
		