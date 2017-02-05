package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

//С помощью циклов нарисовать «обои». Причем количество полос
//должно вводиться с клавиатуры. В примере 7 полос.
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		for (int i = 0; i < 5; i +=1) {
			for (int j = 0; j < number; j +=1) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
