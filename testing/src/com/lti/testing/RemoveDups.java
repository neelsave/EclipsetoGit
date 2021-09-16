package com.lti.testing;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
	int[] remDeps(int []input) throws Exception {
		Set<Integer> s = new HashSet<Integer>();  
		for(int i=0;i<input.length;i++)
		{
			s.add(input[i]);
			if(input[i] <= 0)
			{
				throw new ArithmeticException("Not Valid Array Element");
			}
			
		}
		int i=input.length - 1;
		int[] arr = new int[s.size()]; 
		for(int j:s)
		{
			arr[i] = j;
			i-=1;
		}
		return arr;
		
	}
}
