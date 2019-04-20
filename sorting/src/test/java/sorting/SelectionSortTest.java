package sorting;

import org.junit.Assert;
import org.junit.Test;

import algo.sorting.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortTest {
	
	private final Random randomGen = new Random();
	private final SelectionSort selectionSort = new SelectionSort();
    
	@Test 
    public void testSelectionSort10() {
    	
    	int[] nums = new int[10];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort100() {
        	
       	int[] nums = new int[100];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort200() {
        	
       	int[] nums = new int[200];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort300() {
        	
       	int[] nums = new int[300];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort500() {
        	
       	int[] nums = new int[500];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort1000() {
        	
       	int[] nums = new int[1000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testSelectionSort10000() {
        	
       	int[] nums = new int[10000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	selectionSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Selection sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);

    }
}
