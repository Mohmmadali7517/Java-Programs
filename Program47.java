import java.lang.*;
import java.util.Scanner;

class Program47
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enetr the number:");
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
			System.out.print(iCnt+"  *\t");
		}
	}
}