package com.practice;

public class String_Palendrom {

	
	public static void string_Palendrom(String str){
	
		String temp=str;
		String rev="";
		
		int length=str.length();
		
		for (int i=length-1;i>=0;i--){
			
			rev=rev+str.charAt(i);

			
		}
		if(rev.equals(temp)){
			
			System.out.println("string is a palendrom string");
		}
		else{
			System.out.println("string is not palendrom");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Palendrom.string_Palendrom("ABA");
		String_Palendrom.string_Palendrom("acba");
		String_Palendrom.string_Palendrom("ABBA");
	}

}
