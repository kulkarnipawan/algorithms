/**
 * 
 */
package algo.patternmatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author pawan
 *
 */
public class AhoCorasick {
	
	class Node {
		Map<Character, Node> child;
		Node suffixLink;
		Node outputLink;
		int patternIndex;
		
		Node() {
			child = new HashMap<>();
			patternIndex = -1;
		}
	}
	
	void addPatterntoTrie(String pattern, Node root, int patternIndex) {
		Node node = root;
		for(char c : pattern.toCharArray()) {
			if(!node.child.containsKey(c)) {
				node.child.put(c, new Node());
			}
			
			node = node.child.get(c);
		}
		
		node.patternIndex = patternIndex;
		
	}
	
	void buildSuffixAndOutputLinks(Node root) {
		root.suffixLink = root;
		
		Queue<Node> queue = new LinkedList<>();
		
		for(Character c : root.child.keySet()) {
			Node child = root.child.get(c);
			child.suffixLink = root;
			queue.offer(child);
		}
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			
			//Find suffix link for each child using current nodes suffix link
			for(Character c : current.child.keySet()) {
				Node child = current.child.get(c);
				Node temp = current.suffixLink;
				
				//Keep traversing upwards until you reach root or node contains child with same character
				while(!temp.child.containsKey(c) && temp != root) temp = temp.suffixLink;
				
				if(temp.child.containsKey(c)) 
					child.suffixLink = temp.child.get(c);
				else 
					child.suffixLink = root;
				
				queue.add(child);
			}
			
			//Output link is same as suffix link or output link of suffix link
			if(current.suffixLink.patternIndex >= 0) current.outputLink = current.suffixLink;
			else current.outputLink = current.suffixLink.outputLink;
		}
		
	}
	
	Node constructAutomata(String[] patterns) {
		Node root = new Node();
		
		for(int i=0;i<patterns.length;i++) {
			String pattern = patterns[i];
			addPatterntoTrie(pattern, root, i);
		}
		
		return root;
	}
	
	Node getNextState(Node node, char c, Node root) {
		if(node.child.containsKey(c)) {
			return node.child.get(c);
		} else {
			while(!node.child.containsKey(c) && node != root) node = node.suffixLink;
			
			if(node.child.containsKey(c)) return node.child.get(c);
			else return root;
		}
	}
	
	List<List<Integer>> matchPatterns(String text, String[] patterns, Node root) {
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<patterns.length;i++)
			result.add(new ArrayList<>());
		
		char[] t = text.toCharArray();
		
		int i=0;
		
		Node currState = root;
		while(i<t.length) {
			Node nextState = getNextState(currState, t[i], root);
				
			if(nextState.patternIndex >= 0) {
				int j = patterns[nextState.patternIndex].length();
				result.get(nextState.patternIndex).add(i-j+1);
			}
			
			if(nextState.outputLink != null) {
				Node output = nextState.outputLink;
				int j = patterns[output.patternIndex].length();
				result.get(output.patternIndex).add(i-j+1);
			}
			i++;
			currState = nextState;
		}
		
		return result;
	}
	
	public List<List<Integer>> findMatches(String text, String[] patterns) {
		Node root = constructAutomata(patterns);
		buildSuffixAndOutputLinks(root);
		return matchPatterns(text, patterns, root);
	}

}
