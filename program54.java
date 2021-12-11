import java.lang.*;
import java.util.*;

class program54
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number");
		int iValue=sobj.nextInt();
		

		Demo dobj=new Demo();
		int iRet=dobj.CountGreater(iValue);
		System.out.println("Digits Greater than 5 are :"+iRet);
	}
}
class Demo
{
	public int CountGreater(int iNo)
	{
		int iDigit=0,iCnt=0;
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit>5)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}