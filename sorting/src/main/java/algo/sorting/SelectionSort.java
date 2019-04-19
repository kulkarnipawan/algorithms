/**
 * 
 */
package algo.sorting;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class SelectionSort {
	
	public void sort(int[] nums) {
		if(nums != null && nums.length > 1) {
			int minIndex;
			for(int i=0; i < nums.length - 1; i++) {
				minIndex = i;
				for(int j=i+1; j < nums.length; j++) {
					if(nums[j] < nums[minIndex])
						minIndex = j;
				}
				
				if(minIndex != i) {
					int temp = nums[i];
					nums[i] = nums[minIndex];
					nums[minIndex] = temp;
				}
			}
			
		}
	}

}
