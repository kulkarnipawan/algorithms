/**
 * 
 */
package algo.patternmatching;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pawan
 *
 */
public class FiniteAutomata {
	
	static final int NO_OF_CHARS = 256;
	
	int[][] computeTransformFunction(String pattern) {
		char[] c = pattern.toCharArray();
		
		int[][] transfunc = new int[c.length+1][NO_OF_CHARS];
		
		int lpsLen=0;
		transfunc[0][c[0]]=1;
		
		for(int i=1;i<c.length;i++) {
			
			//Copy values from row number matching longest proper prefix length
			for(int j=0;j<NO_OF_CHARS;j++)
				transfunc[i][j] = transfunc[lpsLen][j];
			
			//Move to next state if you get current character when in current state
			transfunc[i][c[i]] = i+1;
			
			//Adjust longest proper prefix length
			if(i<c.length)
				lpsLen = transfunc[lpsLen][c[i]];
		}
		
		return transfunc;
	}
	
	List<Integer> matchPattern(String text, String pattern, int[][] transfunc) {
		char[] t = text.toCharArray();
		char[] p = pattern.toCharArray();
		
		int i=0, j=0;
		
		List<Integer> listOfIndex = new ArrayList<>();
		
		while(i<t.length) {
			j = transfunc[j][t[i]];
				
			if(j == p.length) {
				listOfIndex.add(i-j+1);
				j--;
			}
			i++;
		}
		
		return listOfIndex;
	}
	
	public List<Integer> findMatches(String text, String pattern) {
		int[][] transfunc = computeTransformFunction(pattern);
		return matchPattern(text, pattern, transfunc);
	}

}
