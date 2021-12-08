import java.lang.*;
import java.util.*;

class program30
{
	public static void main(String Arg[])
	{
		int iLength=0,i=0,iRet=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of elements");
		iLength=sobj.nextInt();
		int Arr[]=new int[iLength];
		System.out.println("Enter Elements");
		for(i=0;i<iLength;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		Marvellous mobj=new Marvellous();
		iRet=mobj.Range(Arr,iLength);
		System.out.println("Count Range is:"+iRet);
	}
}
class Marvellous
{
	public int Range(int Brr[],int iSize)
	{
		int i=0,iCnt=0;
		for(i=0;i<iSize;i++)
		{
			if((Brr[i]>10)&&(Brr[i]<20))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}