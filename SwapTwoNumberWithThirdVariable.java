package com.CodingChallenge.Part_1;

public class SwapTwoNumberWithThirdVariable {
		public static void main(String[] args) {
			int a=10;
			int b=20;
			System.out.println("Before Swaping");
			System.out.println("First Number :"+a+" \n "+"Second Number :"+b);
			int temp =a;
			a=b;
			b=temp;
			System.out.println("After Swaping");
			System.out.println("First Number :"+a+" \n "+"Second Number :"+b);
		}
}
