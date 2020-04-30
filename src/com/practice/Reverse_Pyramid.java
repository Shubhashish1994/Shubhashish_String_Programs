package com.practice;

public class Reverse_Pyramid {

	static int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (i=1;i<=5;i++){
			for (j=6;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
