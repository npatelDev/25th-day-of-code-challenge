package com.CodingChallenge.Part_1;
import java.util.Scanner;
public class FindGreaterNumber {
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter first Number");
			int a=obj.nextInt();
			System.out.println("Enter Secound Number");
			int b=obj.nextInt();
			System.out.println("Enter Third Number");
			int c=obj.nextInt();
			
			while(a>b && a>c) {
				System.out.println("Largest Number is :"+a);
			if(b>c) {
				System.out.println(" Second Largest Number is :"+b);
				System.out.println(" Third Largest Number is :"+c);
				}
				break;
			}
			while(b>a && b>c) {
				System.out.println("Largest Number is :"+b);
			if(a>c) {
				System.out.println(" Second Largest Number is :"+a);
				System.out.println(" Third Largest Number is :"+c);
				}
				break;
			}
			while(c>a && c>b) {
				System.out.println("Largest Number is :"+c);
			if(b>a) {
				System.out.println(" Second Largest Number is :"+b);
				System.out.println(" Third Largest Number is :"+a);
				}
				break;
			}
			obj.close();
		}

		
}
