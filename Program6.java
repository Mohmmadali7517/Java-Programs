/*5. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : H
H e
H e l
H e l l
H e l l o
H e l l
H e l
H e
H
Program Layout : 
class Pattern
{
public void Pattern(String str)
{
// Logic
}
}*/


import java.util.*;

class Pattern
{
	public void Display(String Str)
	{
		char ch[]=Str.toCharArray();

		for(int i=0;i<Str.length()-1;i++)
		{
			for(int j=0;j<Str.length();j++)
			{
				if(i>=j)
				{
					System.out.print(ch[j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i=Str.length()-1;i>=0;i--)
		{
			for(int j=0;j<Str.length();j++)
			{
				if(i>=j)
				{
					System.out.print(ch[j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
class Program6
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter String");

		String str=sobj.nextLine();
        
        Pattern pobj=new Pattern();
        pobj.Display(str);
	}
}