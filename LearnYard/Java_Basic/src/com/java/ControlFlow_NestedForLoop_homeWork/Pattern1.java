package com.java.ControlFlow_NestedForLoop_homeWork;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int m =5;
          int k = 0;
          for(int i=1;i<=m;i++)
          {
        	  for(int j=1;j<=m;j++)
        	  {
        		  System.out.print(k);  
        		  if(k==0)
        		  {
        			  k=1;
        		  }
        		  else
        		  {
        			  k=0;
        		  }
        	  }
        	  k=0;
        	 System.out.println();
          }
	}

}
