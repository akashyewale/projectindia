package javacode;

public class Pallidrome_Number
{

	public static void main(String[] args)
	
	{
		int num=16461;
		int rev=0;
		int org_num=num;
		
		while(num!=0) 
		{
			rev=rev*10+ num%10;
			num=num/10;
		}
		
		if(org_num==rev) 
		{
			System.out.println(org_num+"   is palindrome Number");
		}
		else 
		{
			System.out.println(org_num+    "   is not palindrome Number");
		}

	}

}
