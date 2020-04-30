package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList al=new ArrayList();
		
		for(int i=0;i<=10;i++)
			
			al.add(i);
			System.out.println(al);
			
		   
		@SuppressWarnings("rawtypes")
		Iterator itr= al.iterator();
		
		while(itr.hasNext()){
			
		 int a=(Integer)itr.next();
				 
		if(a%2!=0){
			
			itr.remove();	
		}
		
		}
		System.out.println(al);
		}
		
	}

