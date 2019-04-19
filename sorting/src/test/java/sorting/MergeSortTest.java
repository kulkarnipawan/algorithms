package sorting;

import org.junit.Assert;
import org.junit.Test;

import algo.sorting.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
    
	@Test 
    public void testMergeSort() {
    	MergeSort mergeSort = new MergeSort();
    	
    	Random randomGen = new Random();
    	int[] nums = {10, 4, 5, 1, -1, -5};//new int[10];
//    	for(int i = 0;i < nums.length;i++) {
//    		nums[i] = randomGen.nextInt();
//    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[100];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[200];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[300];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[500];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[1000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
    	nums = new int[10000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	start = System.currentTimeMillis();
    	mergeSort.sort(nums);
    	end = System.currentTimeMillis();
    	System.out.println("Merge sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);

    }
}