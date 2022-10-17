package javacode;

public class Missing_Number_in_Array {

	public static void main(String[] args) {

 int a[]= {1,2,4,5,6,};
 int sum=0;
 
 for(int i=0;i<=a.length-1;i++)
 {
	 sum=sum+a[i];
 }
//System.out.println(sum);

 
 int sum1=0;
 for(int i=0;i<=5;i++)
 {
	 sum1=sum1+i;
 }
// System.out.println(sum1);
 System.out.println("missing number is:"+ (sum-sum1));
	 
 }
}	 
	
	

