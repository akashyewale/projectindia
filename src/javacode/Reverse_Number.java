package javacode;

public class Reverse_Number {

	public static void main(String[] args) {

// Using algorithm

		int num = 1234;
		int rev = 0;

		while (num!=0) {
			rev= rev * 10 + num % 10;// 4 43 32 21
			num = num / 10;

		}
		 System.out.println("Reverse Number is:" +rev);
	}
// using stringbuffer class
		
//	    int num = 1234;
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//
//		System.out.println("Reverse Number is:" +rev);
		

	
	
// using stringbuilder class
//	    int num=1234;
//		StringBuilder sbl=new StringBuilder ();
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();
//		System.out.println("Reverse Number is:" +rev);
	}
	

