package com.java.ControlFlow_NestedForLoop;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=5;
           int k = n;
           for(int i=1;i<=n;i++)
           {
        	   for(int j= 1;j<=i;j++)
        	   {
        		   System.out.print(k);
        	   }
        	   k--;
        	   System.out.println();
           }
	}

}
