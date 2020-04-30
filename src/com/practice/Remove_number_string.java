package com.practice;

public class Remove_number_string {

	public static String delete_Number(String a){
	
		int i;
		
	StringBuffer sb=new StringBuffer(a);
	
		
		//Number ascii :48-57
		//Capital alphabates:65-90
		//small alphabate:97-122
		
		for(i=0;i<sb.length();i++){
			
			if(sb.charAt(i)<48 && sb.charAt(i)>57){
				
				sb.deleteCharAt(i);
				i--;
			}
			

		}
		return a;
	
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="awed453jjh  . jhj";
		Remove_number_string.delete_Number(str);
	}

}
