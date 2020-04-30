package com.practice;

public class qwert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="i am an indian";
  String[] temp=s.split("\\s");
  String result="";
  
  for(int i=temp.length;i>0;i--){
	  
	  result=result+temp[i];
  }
	System.out.println(result);
		
	}

}
