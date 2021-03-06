package algorithms;

import java.util.HashMap;
import java.util.Map;

public class dynamicfibonacci {
	
	public static int callcount=0;
	public static int dynamicfib(int term, Map<Integer, Integer> memo){
		
		callcount++;
		System.out.println("dynamicfib called with argument: "+term);
		
		if (!memo.containsKey(term)){
			memo.put((int)term, (int)(dynamicfib(term-1, memo)+dynamicfib(term-2, memo)) );
		}
		
		return (int)memo.get(term);		
				
	}
	
	public static void main(String[] args){
		
		Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
		memo.put(0, 1); memo.put(1, 1);
//		System.out.println("Fibonacci term 5 is: "+dynamicfib(5, memo)+" with "+callcount+" calls.");
		callcount=0;
		System.out.println("Fibonacci term 30 is: "+dynamicfib(30, memo)+" with "+callcount+" calls.");
		
	}

}
