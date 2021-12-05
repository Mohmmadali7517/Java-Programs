/*4. Write Java program which accept N numbers from user and display 
all such elements which are divisible by 3 and 5.
Input : N : 6
Elements :85 66 3 15 93 88
Output : 15
Program Layout : 
class ArrayDemo
{
public void Display(int Arr[])
{
// Logic
}
}*/

import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		int i=0;
		System.out.println("Number divisible by 3 and 5 are :");
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%3==0)&&(Arr[i]%5==0))
			{
				System.out.println(Arr[i]);
			}
		}
	}
}
class Program7
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the Size of array");
		int iLength=sobj.nextInt();

		int Arr[]=new int[iLength];

		System.out.println("Enter Numbers :");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		ArrayDemo aobj=new ArrayDemo();

		aobj.Display(Arr);

	}
}

