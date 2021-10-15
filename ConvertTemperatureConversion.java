package com.CodingChallenge.Part_1;

import java.util.Scanner;

public class ConvertTemperatureConversion {
		public static void main(String[] args) {
			float Faranite;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Celcious Temperatur Value");
			int a=obj.nextInt();
			
			Faranite=((a*9)/5+32);
			System.out.println("Temperature in Faranite :"+Faranite);
			
			obj.close();
		}
}
