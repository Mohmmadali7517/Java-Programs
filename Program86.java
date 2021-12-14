/*5. Write java program which accept marks of N students from user 
and display class of each student.
Less than 35 - Fail
Less than 50 - Pass class
Less than 60 - Second class
Less than 70 - First class
Greater than 70 - First class with Distinction
Input : 67.3 45.8 88.9 77.5 55.2
Output : 67.3 First class
45.8 Pass class
88.9 First class with Distinction
77.5 First class with Distinction
55.2 Second class
*/

import java.util.*;

class MyArray
{
public void Percentage(float arr[])
{
// Traverse the array and display its class
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0 && arr[i]<=35)
		{
			System.out.println(arr[i]+ " Fail");
		}
		else if(arr[i]>35 && arr[i]<=50)
		{
			System.out.println(arr[i]+ " Pass class");
		}
		else if(arr[i]>50 && arr[i]<=60)
		{
			System.out.println(arr[i]+ " Second class");
		}
		else if(arr[i]>60 && arr[i]<=70)
		{
			System.out.println(arr[i]+ " First class");
		}
		else if(arr[i]>70 && arr[i]<=100)
		{
			System.out.println(arr[i]+ " First class with Distinction");
		}
		else
		{
			System.out.println("Wrong percentage");
		}

	}
}
}

class Program86
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of students :");
		int iSize=sobj.nextInt();

		float p[]=new float[iSize];

		System.out.println("Enter the percentage of each student :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.nextFloat();

		}
		MyArray mobj=new MyArray();
		mobj.Percentage(p);


	}
}