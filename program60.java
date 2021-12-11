import java.lang.*;

class program60
{
	public static void main(String  arg[])
	{
		Demo dobj=new Demo();
		dobj.Display();
	}
}
class Demo
{
	public void Display()
	{
		int iRow=3;
		int iCol=4;
		
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
}}