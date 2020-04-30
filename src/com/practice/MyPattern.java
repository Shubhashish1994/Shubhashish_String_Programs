package com.practice;

public class MyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4,splno = 0,times;
		
		for(int rows=0;rows<=n*2-1;rows++)
		
		{
			System.out.println();
			splno=n-rows;
			
			times=splno*2-1;
			
			for(int cols=0;cols<=n*2-1;cols++)
			{
				
				while(times>=0){
					System.out.print(splno);
		            times --;
				}
				
			}
			
			
		}
		
		
	}

}
