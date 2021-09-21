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
public class KMP {
	
	void computeLPS(String pattern, int[] lps) {
		char[] c = pattern.toCharArray();
		
		int index=0, i=1;
		lps[0]=0;
		
		while(i<c.length) {
			if(c[i] == c[index]) {
				lps[i++]=++index;
			} else {
				if(index>0) {
					index=lps[index-1];
				} else {
					lps[i++]=0;
				}
			}
		}
	}
	
	List<Integer> matchPattern(String text, String pattern, int[] lps) {
		char[] t = text.toCharArray();
		char[] p = pattern.toCharArray();
		
		int i=0, j=0;
		
		List<Integer> listOfIndex = new ArrayList<>();
		
		while(i<t.length) {
			if(t[i]==p[j]) {
				i++;
				j++;
				
				if(j == p.length) {
					listOfIndex.add(i-j);
					j--;
				}
			} else {
				if(j != 0)
					j = lps[j-1];
				else
					i++;
			}
		}
		
		return listOfIndex;
	}
	
	public List<Integer> findMatches(String text, String pattern) {
		int[] lps = new int[pattern.length()];
		computeLPS(pattern, lps);
		return matchPattern(text, pattern, lps);
	}

}
