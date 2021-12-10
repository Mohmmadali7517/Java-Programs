import java.lang.*;
import java.util.Scanner;

class Program49
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Display dobj=new Display();
		dobj.DisplayEven(iValue);
	}
}

class Display
{
	public void DisplayEven(int iNo)
	{
		for(int iCnt=1; iCnt<=iNo; iCnt++)
		{
			System.out.print(iCnt*2 +"\t");
		}
	}
}
