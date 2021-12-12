import java.lang.*;
import java.util.*;

class program67
{
	public static void main(String arg[])
	{
	int Arr[]=new int[5];
	int iCnt=0,iSum=0;
	
	Scanner sobj =new Scanner(System.in);
	System.out.println("Enter Numbers");
	for(iCnt=0;iCnt<5;iCnt++)
	{
		Arr[iCnt]=sobj.nextInt();
	}
	
	iSum=iSum+Arr[0];
	iSum=iSum+Arr[1];
	iSum=iSum+Arr[2];
	iSum=iSum+Arr[3];
	iSum=iSum+Arr[4];
	System.out.println("Addition is: "+iSum);
	}
}