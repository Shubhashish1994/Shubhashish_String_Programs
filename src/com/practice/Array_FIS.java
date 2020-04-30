package com.practice;

public class Array_FIS{
	
public static int getLargest(int[] a, int total){  

	//int temp; 

for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    System.out.println(a[i]=25);
                }  
                
                else if(a[i]>a[j])
                {
                	System.out.println(a[i]=-1);
                }
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
int a[]={15,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.print("1 st array value: "+getLargest(a,6));  
System.out.print("2nd array value: "+getLargest(b,7));  
}
}  	
		
	


