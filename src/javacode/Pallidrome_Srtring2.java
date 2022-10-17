package javacode;

public class Pallidrome_Srtring2 {

	public static void main(String[] args) {
		String str="MADAM";
		String rev="";
		String org_str=str;
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
	System.out.println(rev);
	
		if(org_str.equals(rev))
		{
			System.out.println(org_str+"   is palindrome String");
		}
		else 
		{
			System.out.println(org_str+ "   is not palindrome String");
		}

	}

	
	}


