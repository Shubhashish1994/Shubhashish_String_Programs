package com.practice;

public class Second_Largest_Element {

	
	public static int second_largest(int ar[],int n)
	{
		
		int temp;
		
		for( int i=0;i<n;i++){
			{
				for(int j=i+1;j<n;j++){
					
					if(ar[i]>ar[j]){
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
					}
				}
			}
			
			}
		return ar[n-2];
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={10,5,15,20,32,25};
		int length=ar.length;
		System.out.println("Second Largest: "+Second_Largest_Element.second_largest(ar,length));  
		
	}
}
