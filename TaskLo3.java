package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days;
		int year;
		System.out.println("Input year");
		year = sc.nextInt();
		if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
		days = 366;
		System.out.println("This year consist of "+ days + " days.");
		} else {
			days = 365;
			System.out.println("This year consist of "+ days + " days.");
		sc.close();	
		}
		
		
	}

}
