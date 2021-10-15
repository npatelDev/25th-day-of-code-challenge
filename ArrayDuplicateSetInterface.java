package com.CodingChallenge.Part_1;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateSetInterface {
		public static void main(String[] args) {
			int[] a= {2,3,3,5,7,5,9,7};
			
			Set<Integer> s=new HashSet<Integer>();
				for(int b:a) {
					if(s.add(b)== false) {
						System.out.println(b+" ");
					}
				}
		}
}
