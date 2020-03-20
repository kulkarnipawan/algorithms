/**
 * 
 */
package algo.sorting;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class HeapSort {
	
	public void sort(int[] nums) {
		if(nums != null && nums.length > 1) {
			int temp;
			for(int i=0; i<nums.length-1; i++) {
				//Create max heap of size n-i
				createMaxHeap(nums, nums.length-i);
				//Swap max element from top of heap to end of array
				if(nums[0] != nums[nums.length-i-1]) {
					temp = nums[0];
					nums[0] = nums[nums.length-i-1];
					nums[nums.length-i-1] = temp;
				}
			}
		}
	}
	
	private void createMaxHeap(int[] nums, int treeLen) {
		int maxChild, temp;
		for(int i=(treeLen - 2)/2; i>=0; i--) {
			maxChild = 2*i + 1;
			if(2*i + 2 <= treeLen - 1 && nums[2*i + 2] > nums[maxChild]) {
				maxChild = 2*i + 2;
			}
			if(nums[i] < nums[maxChild]) {
				temp = nums[i];
				nums[i] = nums[maxChild];
				nums[maxChild] = temp;				
			}
		}
	}

}
