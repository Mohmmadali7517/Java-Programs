import java.lang.*;
import java.util.*;

class program56
{
	public static void main(String arg[])
	{
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter number");
	int iNo=sobj.nextInt();
	
	Display dobj=new Display();
	dobj.Display(iNo);
	}
}
class Display
{
	public void Display(int iValue)
	{
		int iCnt=0;
		char ch='\0';
		for(iCnt=1,ch='a';iCnt<=iValue;iCnt++,ch++)
		{
			System.out.println(ch);
		}
	}
}