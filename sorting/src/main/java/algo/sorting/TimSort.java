/**
 * 
 */
package algo.sorting;

import java.util.Arrays;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class TimSort {
	
	public void sort(int[] nums) {
		final int CHUNK = 32;
		int i,j,middle,end;
		if(nums!=null && nums.length>1) {
			for(i=0;i<nums.length;i+=CHUNK) {
				end = i+CHUNK;
				if(end>nums.length) {
					end = nums.length;
				}
				insertionSort(nums, i, end);
			}
			System.out.println(Arrays.toString(nums));
			
			for(i=CHUNK;i<nums.length;i*=2) {
				for(j=0;j<nums.length;j+=i*2) {
					middle = j+i-1;
					end = j+i*2-1;
					if(end>=nums.length) {
						end = nums.length-1;
					}
					if(middle<end) {
						merge(nums, j, middle, end);
					}
				}
			}			
		}		
	}
	
	private void insertionSort(int[] nums, int start, int end) {
		int element;
		int j;
		for(int i=start+1; i<end; i++) {
			element = nums[i];
			j = i-1;
			while(j>=start && nums[j] > element) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = element;
		}
	}
	
	private void merge(int[] nums, int start, int middle, int end) {
		int[] result = new int[end-start+1];
		int left=start;
		int right=middle+1;
		int index=0;
		
		System.out.println(start + ":" + middle + ":" + end);
		
		while(left<=middle && right<=end) {
			if(nums[left]<=nums[right]) {
				result[index] = nums[left];
				left++;
			} else {
				result[index] = nums[right];
				right++;
			}
			index++;
		}
		while(left<=middle) {
			System.out.println(index+":"+left);
			result[index] = nums[left];
			left++;
			index++;
		}
		while(right<=end) {
			result[index] = nums[right];
			right++;
			index++;
		}
		for(index=0;index<result.length;index++) {
			nums[start+index]=result[index];
		}
	}
 
}
