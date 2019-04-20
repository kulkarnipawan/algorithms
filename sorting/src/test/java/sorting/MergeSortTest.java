package sorting;

import org.junit.Assert;
import org.junit.Test;

import algo.sorting.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
	
	private final Random randomGen = new Random();
	private final MergeSort mergeSort = new MergeSort();
    
	@Test 
    public void testMergeSort10() {
    	
    	int[] nums = new int[10];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort100() {
        	
       	int[] nums = new int[100];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort200() {
        	
       	int[] nums = new int[200];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort300() {
        	
       	int[] nums = new int[300];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort500() {
        	
       	int[] nums = new int[500];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort1000() {
        	
       	int[] nums = new int[1000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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
    	
	}
	
	@Test 
    public void testMergeSort10000() {
        	
       	int[] nums = new int[10000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
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

    }
}
