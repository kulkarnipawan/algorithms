package sorting;

import org.junit.Assert;
import org.junit.Test;

import algo.sorting.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortTest {
	
	private final Random randomGen = new Random();
	private final QuickSort quickSort = new QuickSort();
    
	@Test 
    public void testQuickSort10() {
    	
    	int[] nums = new int[10];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort100() {
        	
       	int[] nums = new int[100];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort200() {
        	
       	int[] nums = new int[200];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort300() {
        	
       	int[] nums = new int[300];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort500() {
        	
       	int[] nums = new int[500];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort1000() {
        	
       	int[] nums = new int[1000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testQuickSort10000() {
        	
       	int[] nums = new int[10000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	quickSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Quick sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);

    }
}
