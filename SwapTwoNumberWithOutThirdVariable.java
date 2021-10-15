package com.CodingChallenge.Part_1;

public class SwapTwoNumberWithOutThirdVariable {
		public static void main(String[] args) {
			int a=20;
			int b=10;
			System.out.println("Before Swaping");
			System.out.println("First Number :"+a+" \n "+"Second Number :"+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swaping");
			System.out.println("First Number :"+a+" \n "+"Second Number :"+b);
		}
}
