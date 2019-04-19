/**
 * 
 */
package algo.sorting;

/**
 * @author pawkulka
 *
 */
public class BubbleSort {
	
	public void sort(int[] nums) {
		int temp;
		if(nums != null && nums.length > 1) {
			for(int i=0; i < nums.length - 1; i++) {
				for(int j=0; j < nums.length-i-1; j++) {
					if(nums[j] > nums[j+1]) {
						temp = nums[j+1];
						nums[j+1] = nums[j];
						nums[j] = temp;
					}
				}
			}
			
		}
	}

}
