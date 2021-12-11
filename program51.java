import java.lang.*;
import java.util.*;

class program51
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter first Number");
		int iValue1=sobj.nextInt();
		System.out.println("Enter Second Number");
		int iValue2=sobj.nextInt();
		System.out.println("Enter third Number");
		int iValue3=sobj.nextInt();
		float fRet=0.0f;
		Average obj=new Average();
		fRet=obj.Average(iValue1,iValue2,iValue3);
		System.out.println("Average is :"+fRet);
	}
}
class Average
{
	public float Average(int iNo1,int iNo2,int iNo3)
	{
		int iSum=iNo1+iNo2+iNo3;
		float fResult=(float)iSum/3;
			return fResult;
	}

}