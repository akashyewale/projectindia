package javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any English Statement");
		String str=sc.nextLine();
		sc.close();
		//String str= "nishikant khandale";
		char[] ca=str.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c:ca){
			
			if (m.containsKey(c)) {
				
				m.put(c,m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
			
		}
		for(Character c:m.keySet()) {
			if(m.get(c)>1) {
				System.out.println("Character " +c+ " is repeated " +m.get(c)+ " times");
			}
		}
	}

}
