package com.CodingChallenge.Part_1;

public class duplicateArrayValue {
	public static void main(String[] args) {
		System.out.println("Duplicate value of array");
		int[] a=new int[] {2,3,3,5,7,2,7,9};
		for(int i=0; i<=a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j] && i!=j) {
					System.out.println(a[j]+" ");
				}
			}
		}
	}
}

