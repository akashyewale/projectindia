package javacode;

public class Print_even_odd_number_from_array {

    public static void main(String[] args) {
	int a []= {1,2,3,4,5,6,7,8,9};
	
	
//	System.out.println("the even numbers are:");
//	for(int i=0;i<a.length;i++)
//	{
//		
//		if(a[i]%2==0)
//			System.out.println(a[i]);
//	}	
//	
//	System.out.println("the odd numbers are:");
//	for(int i=0;i<a.length;i++)
//	{
//		
//		if(a[i]%2!=0)
//			System.out.println(a[i]);
//	}		
	
// by enhanced for loop
	System.out.println("the even numbers are:");
	for(int value:a)
	{
		if(value%2==0)
			System.out.println(value);
	}
	System.out.println("the odd numbers are:");
	for(int value:a)
	{
		if(value%2!=0)
			System.out.println(value);
	}
	
	}	
}	
	   




