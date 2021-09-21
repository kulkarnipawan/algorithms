package algo.patternmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AhoCorasickTest {
	
	private final AhoCorasick ahoCorasick = new AhoCorasick();
    
	@Test 
    public void testAhoCorasick10() {
    	
       	String text = "GCATCGBODY";
       	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = 0;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1) list.add(index);
       		} while(index != -1);
       		expectedResult.add(list);
       	}
       	
       	Assert.assertEquals(expectedResult, result);

    	
	}
	
	@Test 
    public void testAhoCorasick100() {
        	
       	String text = "GCATCGBODY";
	   	StringBuilder sb = new StringBuilder();
	   	for(int i=0;i<10;i++) {
	   		sb.append(text);
	   	}
	   	text = sb.toString();

       	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<10;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testAhoCorasick200() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<20;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
      	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<20;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	
    	Assert.assertEquals(expectedResult, result);
    	
	}
	

	@Test 
    public void testAhoCorasick500() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<50;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
      	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<50;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testAhoCorasick1000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<100;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
      	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<100;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	
    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testAhoCorasick10000() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<1000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
      	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<1000;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	

    	Assert.assertEquals(expectedResult, result);
	}
	
	@Test 
    public void testAhoCorasick100K() {
        	
       	String text = "AAAAABAAAB";
       	StringBuilder sb = new StringBuilder();
       	for(int i=0;i<10000;i++) {
       		sb.append(text);
       	}
       	text = sb.toString();
       	
      	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<10000;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	

    	Assert.assertEquals(expectedResult, result);
	}

	@Test 
    public void testAhoCorasick1G() {
        	
       	String text = "GCATCGBODY";
	   	StringBuilder sb = new StringBuilder();
	   	for(int i=0;i<100000;i++) {
	   		sb.append(text);
	   	}
	   	text = sb.toString();

       	String[] pattern = {"ACC", "ATC", "CAT", "GCG", "A", "T", "C"};

       	long start = System.currentTimeMillis();
       	List<List<Integer>> result = ahoCorasick.findMatches(text, pattern);
       	long end = System.currentTimeMillis();
       	System.out.println("Pattern matching using AhoCorasick for text of :" 
       			+ text.length() + ": characterss took :" 
       			+ (end - start)
       			+ " ms");
       	List<List<Integer>> expectedResult = new ArrayList<>();
       	for(int i=0;i<pattern.length;i++) {
       		List<Integer> list = new ArrayList<>();
       		int index = -1;
       		do {
       			index = text.indexOf(pattern[i], index+1);
       			if(index != -1 && index<10) list.add(index);
       		} while(index != -1 && index<10);
       		
       		int size = list.size();
       		for(int k=1;k<100000;k++) {
        		for(int j=0;j<size;j++) {
        			list.add(k*10+list.get(j));
        		}
           	}

       		expectedResult.add(list);
       	}
    	
    	Assert.assertEquals(expectedResult, result);
	}

}
