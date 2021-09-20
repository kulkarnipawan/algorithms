package algo.patternmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FiniteAutomataTest {
	
	private final FiniteAutomata finiteAutomata = new FiniteAutomata();
    
	@Test 
    public void testFiniteAutomata10() {
    	
       	String text = "AAAAABAAAB";
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
    						+ text.length() + ": characterss took :" 
    						+ (end - start)
    						+ " ms");
    	Assert.assertEquals(Arrays.asList(0, 1), result);
    	
	}
	
	@Test 
    public void testFiniteAutomata100() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<10;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata200() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<20;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata500() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<50;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata1000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<100;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata10000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<1000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata100K() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<10000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
    public void testFiniteAutomata1G() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<100000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
    	String pattern = "AAAA";
    	long start = System.currentTimeMillis();
    	List<Integer> result = finiteAutomata.findMatches(text, pattern);
    	long end = System.currentTimeMillis();
    	System.out.println("Pattern matching using FiniteAutomata for text of :" 
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
