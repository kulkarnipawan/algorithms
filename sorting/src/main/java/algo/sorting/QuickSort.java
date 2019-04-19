/**
 * 
 */
package algo.sorting;

/**
 * @author pawkulka
 *
 */
public class QuickSort {
	
	public void sort(int[] nums) {
		if(nums != null && nums.length > 1) {
			quickSort(nums, 0, nums.length-1);			
		}
	}
	
	private void quickSort(int[] nums, int low, int high) {
		if(high>low) {
			int p = partition(nums, low, high);
			
			quickSort(nums, low, p-1);
			quickSort(nums, p+1, high);
		}
	}
	
	private int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		
		int i=low-1;
		
		int temp;
		for(int j=low; j<=high-1; j++) {
			if(nums[j]<=pivot) {
				i++;
				if(i!=j) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		i++;
		if(i!=high) {
			nums[high] = nums[i];
			nums[i] = pivot;
		}
		return i;
	}

}
