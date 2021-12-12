import java.lang.*;
import java.util.*;

class program71
{
	public static void main(String arg[])
	{
		int Arr[]=new int[5];
		int iSum=0,iCnt=0;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Numbers");
		for(iCnt=0;iCnt<5;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		for(iCnt=0;iCnt<5;iCnt++)
		{
			iSum=iSum+Arr[iCnt];
		}
		System.out.println("Addition is "+iSum);
	}
}