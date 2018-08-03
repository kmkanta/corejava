package com.corejava;

import java.util.Scanner;

public class ToCheckEvenOrOdd {
	public void toCheckEvenOrOdd() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println(number+" is Even");
		}else {
			System.out.println(number+" is Odd");
		}
	}
public static void main(String[] args) {
	ToCheckEvenOrOdd obj = new ToCheckEvenOrOdd();
	obj.toCheckEvenOrOdd();//Sample
}
}
