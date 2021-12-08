import java.lang.*;

class program26
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
		int iNo=7521;
		int iDigit=0;
		
		iDigit=iNo%10;
		System.out.println(iDigit);
		iNo=iNo/10;
		
		iDigit=iNo%10;
		System.out.println(iDigit);
		iNo=iNo/10;
		
		iDigit=iNo%10;
		System.out.println(iDigit);
		iNo=iNo/10;
		
		iDigit=iNo%10;
		System.out.println(iDigit);
		iNo=iNo/10;
	}
}