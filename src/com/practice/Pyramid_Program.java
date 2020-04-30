package com.practice;

public class Pyramid_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//triangle program
		
	/*	for(int i=0;i<9;i++)
		{
			
			//left side space print
			for(int j=9;j>=i;j--){
				
				System.out.print(" ");
			}
			
			//right side * and space print
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
			
		}
*/
		
	
		
		
// reverse right angle triangle
		
	/*	for(int i=0;i<4;i++){
			
			for(int j=4;j>i;j--){
				
				System.out.print("*");
			}
			System.out.println();
			}
*/
		
		
		
//right angle triangle
		
/*	for(int i=0;i<4;i++){
			
			for(int j=0;j<=i;j++){
				
				System.out.print("*");
			}
			System.out.println();
		   }
	
	*/
	
	for(int i=0;i<4;i++){
		
		
         for(int j=0;j<=i;j++){
			
			System.out.print("* ");
		}
		
		for(int j=3;j>=i;j--){
			
			System.out.print(" ");
		}
		
		System.out.println();
	     }
		}
		
	}

	