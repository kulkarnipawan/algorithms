/**
 * 
 */
package algo.sorting;

import java.util.Arrays;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class MergeSort {
	
	public void sort(int[] nums) {
		if(nums != null && nums.length > 1) {
			mergeSort(nums, 0, nums.length-1);			
		}
	}
	
	private void mergeSort(int[] nums, int low, int high) {
		if(high>low) {
			int middle = (high+low)/2;
			
			mergeSort(nums, low, middle);
			mergeSort(nums, middle+1, high);
			
			merge(nums, low, middle, high);
		}
	}
	
	private void merge(int[] nums, int low, int middle, int high) {
		int[] result = new int[nums.length];
		
		int i = low;
		int j = middle+1;
		int index=low;
		
		while(i<=middle && j<=high) {
			if(nums[i] <= nums[j]) {
				result[index] = nums[i];
				i++;
			} else {
				result[index] = nums[j];
				j++;
			}
			index++;
		}
		
		while(i<=middle) {
			result[index] = nums[i];
			i++;
			index++;
		}

		while(j<=high) {
			result[index] = nums[j];
			j++;
			index++;
		}
		
		for(i=low; i<=high; i++) {
			nums[i] = result[i];
		}
	}

}
