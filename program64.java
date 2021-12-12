import java.lang.*;
import java.util.*;

class program64
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Row");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter Col");
		int iValue2=sobj.nextInt();
		
		Display dobj=new Display();
		dobj.Display(iValue1,iValue2);
	}
}
class Display
{
	public void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==j)
				{
					System.out.print("$\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
}
					