package javacode;

public class ReverseString {

	public static void main(String[] args) {
	
// using String + operator
		
//		String str = "ABCD";
//		String rev = "";
//		
//		int len=str.length();  //4 but by index it is 0123
//		
//		for(int i=len-1;i>=0;i--)
//		{
//		rev= rev+str.charAt(i);	
//		}
//		System.out.println("reverse string is: "+ rev);

		
		
// using character array
		
//		String str= "ABCD";
//		String rev="";
//		char a[]=str.toCharArray();
//		int len= str.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
//		System.out.println("reverse string is: "+ rev);	
	
//using stringbuffer
		
	String str="ABCD";
	StringBuffer sb=new StringBuffer(str);
	StringBuffer rs=sb.reverse();
	System.out.println(rs);
	
	
	
	
	
	
	}

}
