package com.practice;

public class Pattern_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		
		int total = n+(n-1);
		for (int rows=0;rows<=total;rows++)
	     {
			 
	    	 for (int cols =0; cols<total;cols++)
	    	 { 
				if(rows < (total / 2)+1)
				 {
					
				   while (cols < total/2)
				   {
				     int spln= n-rows;
				     int times = 0;  
				     int i= n; 
				     while(i > spln)
				     {
				           System.out.print (""+(n-cols));
				           cols++;
				           i--;
				     }   
				     while(times<=total - rows*2 -1)
				     {
				    	 System.out.print (spln);
				         cols++;
				         times++;
				     }
				    int remaining = n- spln;
				    int cnt =1;
				    while(remaining>0)
				    {
				    	System.out.print ((spln+cnt));
				    	cnt++;
				    	remaining--;
				    	cols++;
				    }
				   }
				 }
				 // Remaining rows
				
				if(rows > (total / 2)+1)
				 {
					
				   while (cols < total/2)
				   {
				     int spln= rows-n+1;
				     int times = 1;  
				     int i= n; 
				     
				     while(i > spln)
				     {
				           System.out.print (""+(n-cols));
				           cols++;
				           i--;
				     }   
				     while(times<=spln+(spln-1))
				     {
				    	 System.out.print (""+spln);
				         cols++;
				         times++;
				     }
				    int remaining = n- spln;
				    int cnt =1;
				    while(remaining>0)
				    {
				    	System.out.print ((spln+cnt));
				    	cnt++;
				    	remaining--;
				    	cols++;
				    }
				   }
				 }
				
				
	    	 }
	    	 if((rows < ( (total / 2)+1 ) ) || (rows > ( (total / 2)+1 ) ))
	    	 System.out.println();
	     }	
		
		
	}

}
