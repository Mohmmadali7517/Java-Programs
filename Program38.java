import java.util.Scanner;

class Program38
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int iValue=sobj.nextInt();
		
		Digits dobj=new Digits();
		boolean bRet=dobj.CheckPallindrome(iValue);
		
		if(bRet==true)
			System.out.print("The number is Pallindrome");
		else
			System.out.print("The number is not Pallindrome");
		
	}
}

class Digits
{
	public boolean CheckPallindrome(int iNo)
	{
		int iTemp=iNo, iDigit=0, iReverse=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iReverse=iReverse*10+iDigit;
			iNo=iNo/10;
		}
		
		if(iReverse==iTemp)
			return true;
		else
			return false;
	}
}
			

			
	
			
			