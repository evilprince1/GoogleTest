package net.finra.assess.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneService {
	
	private final List<char[]> keys = Arrays.asList(
			"0".toCharArray(), "1".toCharArray(),
			"2abc".toCharArray(), "3def".toCharArray(),
			"4ghi".toCharArray(), "5jkl".toCharArray(),
			"6mno".toCharArray(), "7pqrs".toCharArray(),
			"8tuv".toCharArray(), "9wxyz".toCharArray());
	
	public long totalPossibleCombinations(String number){
		
		char[] numchar = number.toCharArray();
		
		long total = 1l;
		
		for(int i=number.length()-1; i>=0; i--){
			
			String temp = String.valueOf(numchar[i]);
			char[] pattern = keys.get(Integer.valueOf(temp));
			
			total *= pattern.length;
			
		}
		
		return total;
	}
	
	public List<String> combinationsByPage(String number){
		
		List<String> list = new ArrayList<String>();
		
		
		return null;
		
	}
	

}
