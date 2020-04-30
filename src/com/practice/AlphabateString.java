package com.practice;

public class AlphabateString {

	
	
	public static void Alphabate(String s,int size){
		
		
		char[] ch=s.toCharArray();
		
		char[] temp=new char[100];
		
		System.out.println(ch);
		
		for(int i=0;i<size;i++){
			
			for(int j=0;j<i;j++){
			
			if(ch[i]>=65 & ch[i]<93){
			
				temp[j]=ch[i];
				System.out.println(temp[j]);
			}
			
			else
				System.out.print("rest alphabate are:"+ch[i]);
			}       
		}
		}	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AbBa124ZFdf";
		int length=str.length();
		AlphabateString.Alphabate(str,length);		
		
	}

}
