package com.java.ControlFlow_NestedForLoop;

public class RhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n =5;
      for(int i =1;i<=n;i++)
      {
//    	  Spaces
    	  for(int j=1;j<= i-1;j++)
    	  {
    		  System.out.print(" ");
    	  }
//    	  Star
    	  for(int j=1;j<=n;j++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }
	}

}
