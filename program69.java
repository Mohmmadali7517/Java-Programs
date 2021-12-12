import java.lang.*;
import java.util.*;

class program69
{
	public static void main(String arg[])
	{
		int Arr[]=new int[5];
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Numbers");
	    Arr[0]=sobj.nextInt();
		Arr[1]=sobj.nextInt();
		Arr[2]=sobj.nextInt();
		Arr[3]=sobj.nextInt();
		Arr[4]=sobj.nextInt();
		int iSum=Arr[0]+Arr[1]+Arr[2]+Arr[3]+Arr[4];
		System.out.println("Addition is :"+iSum);
	}
}