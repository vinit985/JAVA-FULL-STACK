 package com.java.ControlFlow_NestedForLoop;

public class NumberPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =5;
		int leftSpace=0;
		int middleSpace = ((m-2)*2)+1;
       for(int i=1;i<=m;i++)
       {
//    	   Left spaces 
    	   for(int j=1;j<=leftSpace;j++)
    	   {
    		   System.out.print(" ");
    	   }
    	   System.out.print(i);
//    	   Middlespace
    	   for(int j=1;j<=middleSpace;j++)
    	   {
    		   System.out.print(" ");
    	   }
    	   leftSpace++;
    	   middleSpace = middleSpace-2;
    	   if(i!=m) {
    		   System.out.print(i);
    	   }
    	   System.out.println();
       }
    	 int n = m-1;
    	 leftSpace = leftSpace-2;
    	 middleSpace = 1;
    	 for(int k=n;k>=1;k--)
    	 {
    		 for(int j=1;j<=leftSpace;j++)
    		 {
    			 System.out.print(" ");
    		 }
    		 System.out.print(k);
    		 for(int l=1;l<=middleSpace;l++)
    		 {
    			 
    			 System.out.print(" ");
    		 }
    		 System.out.print(k);
    		 leftSpace--;
    		 middleSpace = middleSpace+2;
    		 System.out.println();
    		 
    	 }
    	   
        
	}

}
