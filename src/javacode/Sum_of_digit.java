package javacode;

public class Sum_of_digit {

	public static void main(String[] args) {
		long num=123456789;
		long rev=0;
		
		while(num!=0) {
			
			rev=rev+num%10;
			num=num/10;
			
			
			
		}
		
		System.out.println(rev);
	}

}
