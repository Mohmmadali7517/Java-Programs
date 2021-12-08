import java.lang.*;

class program27
{
	public static void main(String arg[])
	{
		Display obj=new Display();
		obj.Display();
	}
}

class Display
{
	public void Display()
	{
		int iNo=123456789;
		int iDigit=0;
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			System.out.println(iDigit);
			iNo=iNo/10;
		}
	}
}