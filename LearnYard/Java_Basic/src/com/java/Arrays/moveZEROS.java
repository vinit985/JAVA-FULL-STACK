package com.java.Arrays;

public class moveZEROS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeroes(new int[] {0,1,0,3,12});
		

	}
    public static void moveZeroes(int[] nums) {
        
    	 int newArray[] = new int[nums.length];
         int j=0;
         for(int i = 0;i<nums.length;i++)
         {
           if(nums[i]!=0)
           {
               newArray[j] = nums[i];
               j++;
           }
         }
         while(j<nums.length)
         {
           newArray[j] = 0;
           j++;
         }
         nums = newArray.clone();

        for(int i =0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+" ");
        }


      }
}
