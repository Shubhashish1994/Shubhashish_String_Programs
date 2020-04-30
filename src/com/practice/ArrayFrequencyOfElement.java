package com.practice;

import java.util.HashMap;

public class ArrayFrequencyOfElement {

	public static void main(String[] args) {
		
		int[] ar={1,2,1,3,2,4,3,5};
		
		HashMap <Object,Integer> map=new HashMap<Object,Integer>();
        
		for(int c:ar){
			
			if(map.containsKey(c)){
				
				map.put(c, map.get(c)+1);
			}
			
			else{
				map.put(c, 1);
			}
		}
			
		System.out.println("Occurance of element in array" +" : "+map);
		

	}

}
