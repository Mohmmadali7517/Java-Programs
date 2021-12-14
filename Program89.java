/*3. Write Java program which accept array of characters from user and
accept one character. Return occurrence of that character without
considering case.
Input : b N e B R b A i G i B

b
Output : 4
class MyArray
{
int Search(char arr[])
{
}
}*/
import java.util.*;

class MyArray
{
public int Search(char arr[],char ch)
{
	int iCnt=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ch||arr[i]==Character.toUpperCase(ch)||arr[i]==Character.toUpperCase(ch))
		{
			iCnt++;
		}
		
	}
	return iCnt;

}
}

class Program89
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number of elements ");
		int iSize=sobj.nextInt();

		char p[]=new char[iSize];

		System.out.println("Enter the elements :");
		for(int i=0;i<iSize;i++)
		{
			p[i]=sobj.next().charAt(0);
		}


		System.out.println("Enter character to search :");
		char ch=sobj.next().charAt(0);

		MyArray mobj=new MyArray();
		int iRet=mobj.Search(p,ch);
		System.out.println("occurrence of that character is :"+iRet);
	}
}