package algo.patternmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class KMPTest {
	
	private final KMP kmp = new KMP();
    
	@Test 
    public void testKMP10() {
    	
       	String text = "AAAAABAAAB";
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertEquals(result, Arrays.asList(0, 1));
    	
	}
	
	@Test 
    public void testKMP100() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<10;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<10;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testKMP200() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<20;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<20;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
    	
	}
	

	@Test 
    public void testKMP500() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<50;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<50;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testKMP1000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<100;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<100;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testKMP10000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<1000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<1000;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testKMP100K() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<10000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<10000;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}

	@Test 
    public void testKMP1G() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<100000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = kmp.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using KMP for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	List<Integer> expectedResult = new ArrayList<>();
    	expectedResult.add(0);
    	expectedResult.add(1);
    	
    	for(int i=1;i<100000;i++) {
    		expectedResult.add(i*10);
        	expectedResult.add(i*10+1);
       	}
    	Assert.assertEquals(expectedResult, result);
	}

}
