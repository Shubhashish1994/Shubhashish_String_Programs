package com.practice;

public class Plendrom_Number {

	
	public static void Plaen_Number(int n) {
	
		int sum=0;
		int temp=n;
		
		while(n>0){
	
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
		
		if(temp==sum){
			System.out.println("palendrom number");
		}
		else{
			System.out.println("not palendrom number");
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plendrom_Number.Plaen_Number(121);
		Plendrom_Number.Plaen_Number(123);
		
	}

}
