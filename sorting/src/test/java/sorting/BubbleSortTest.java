package sorting;

import org.junit.Assert;
import org.junit.Test;

import algo.sorting.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
	
	private final Random randomGen = new Random();
	private final BubbleSort bubbleSort = new BubbleSort();
    
	@Test 
    public void testBubbleSort10() {
    	
    	int[] nums = new int[10];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort100() {
        	
       	int[] nums = new int[100];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort200() {
        	
       	int[] nums = new int[200];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort300() {
        	
       	int[] nums = new int[300];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort500() {
        	
       	int[] nums = new int[500];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort1000() {
        	
       	int[] nums = new int[1000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);
    	
	}
	
	@Test 
    public void testBubbleSort10000() {
        	
       	int[] nums = new int[10000];
    	for(int i = 0;i < nums.length;i++) {
    		nums[i] = randomGen.nextInt();
    	}
    	
    	int[] result = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(result);
    	long start = System.currentTimeMillis();
    	bubbleSort.sort(nums);
    	long end = System.currentTimeMillis();
    	System.out.println("Bubble sort for array of :" 
    						+ nums.length + ": elements took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertArrayEquals(result, nums);

    }
}
