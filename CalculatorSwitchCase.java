package com.CodingChallenge.Part_1;

import java.util.Scanner;

public class CalculatorSwitchCase {
		char operator;
		double num1,num2,result;
	public static void main(String[] args) {
		char operator;
		double num1,num2,result;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    
		System.out.println("Enter First Number");
		num1=input.nextInt();
		
		System.out.println("Enter Second Number");
		num2=input.nextInt();
		
		switch(operator){
		case '+':
			result=num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			
			result=num1-num2;
			
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '%':
			
			result=num1%num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
			
			break;
		case '/':
			
				result=num1/num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				
				break;
		default:
	        System.out.println("Invalid operator!");
	        break;
		}
		input.close();
	}

	
}
