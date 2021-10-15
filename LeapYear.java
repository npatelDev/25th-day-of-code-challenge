package com.CodingChallenge.Part_1;

import java.util.Scanner;

public class LeapYear {
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter year");
			int a=obj.nextInt();
			
			if(a%4 == 0) {
				System.out.println(a+" "+"is a Leap Year");
				}
			else if(a%400 == 0) {
				System.out.println(a+" "+"is a Leap Year");
			}else {
				System.out.println(a+" "+"is not a Leap Year");
			}
			obj.close();
			
		
			
}
}

