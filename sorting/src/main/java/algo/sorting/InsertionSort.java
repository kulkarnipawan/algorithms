/**
 * 
 */
package algo.sorting;

/**
 * @author Pawankumar Kulkarni
 *
 */
public class InsertionSort {
	
	public void sort(int[] nums) {
		if(nums != null && nums.length > 2) {
			int j, element;
			for(int i=1; i < nums.length; i++) {
				j = i-1;
				element = nums[i];
				while(j >= 0 && nums[j] > element ) {
					nums[j+1] = nums[j];
					j--;
				}
				nums[j+1] = element;
			}			
		}
	}

}
