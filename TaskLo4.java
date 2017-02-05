package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Input a");
		a = sc.nextDouble();
		double b;
		System.out.println("Input b");
		b = sc.nextDouble();
		double c;
		System.out.println("Input c");
		c = sc.nextDouble();
		if (a+b>c && a+c>b && b+c>a){
			System.out.println("Your triangle is exist.");
		}else{
			System.out.println("Your triangle doesn`t exist.");
		}
		sc.close();
	}

}
