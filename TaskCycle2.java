package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Input n");
	n = sc.nextInt();
	int fac = 1;
	if (n > 4 && n < 16) {
		for (int i = 1; i <= n; i++){
		fac = i * fac;
		}
		System.out.println("factorial "+n+" = "+ fac);
		
	} else {
		System.out.println("Wrong number n");
	}
	sc.close();
	}

}
