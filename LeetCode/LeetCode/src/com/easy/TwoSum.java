package com.easy;


/**
 * @author ASubramani
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int input[] = {3,3,3,3};
		int target = 6;
		int [] output =twoSum(input, target);
		for(int i : output) {
        	System.out.print(i + " ");
        }
	}
	
	/**
	 * Example 1:
			Input: nums = [2,7,11,15], target = 9
			Output: [0,1]
			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 * Example 2:
			Input: nums = [3,2,4], target = 6
			Output: [1,2]
	 * Example 3:
			Input: nums = [3,3], target = 6
			Output: [0,1
	 */
	public static int [] twoSum(int [] nums, int target) {
		int output[]= new int[2];
        for(int i =0 ; i< nums.length ; i++){
            if(i < nums.length - 1 && nums[i] + nums[i+1] == target){
                output[0] = i;
                output[1] = i+1;
                return output;
            }
        }
        for(int i =0 ; i< nums.length ; i++){
            for(int j =i + 1 ; j < nums.length ; j++){
                if(i < nums.length - 1 &&  nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
       return output;
	}

}
