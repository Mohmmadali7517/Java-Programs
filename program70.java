import java.lang.*;
import java.util.*;

class program70
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
		iSum=Arr[0]+Arr[1]+Arr[2]+Arr[3]+Arr[4];
		System.out.println("Addition is :"+iSum);
	}
}
		