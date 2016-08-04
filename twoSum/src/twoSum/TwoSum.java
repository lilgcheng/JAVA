package twoSum;

import java.util.Scanner;

public class TwoSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={3,2,4};
		int target=6;
		int a[]=null;
		int i;
		a = twoSum(nums,target);
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
    public static int[] twoSum(int[] nums, int target) {
		int i,j;
		int answer[] = null;
//		for(i=0;i<nums.length;i++){
//			System.out.println(nums[i]);
//		}
		for(i=0;i<nums.length;i++){
			for(j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					return answer = new int[]{i,j};
				}
			}
		}
    	return null;
    }
}