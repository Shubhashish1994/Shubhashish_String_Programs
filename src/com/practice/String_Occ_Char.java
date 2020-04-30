package com.practice;

import java.util.HashMap;

public class String_Occ_Char {

	
	public static void occ_char(String s){
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		char[] ch=s.toCharArray();
		
		for(char c:ch){
			
			if(map.containsKey(c)){
				
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
		
		System.out.println(s +" : "+map);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Occ_Char.occ_char("aaabbb66666555cccfff");
	}

}
