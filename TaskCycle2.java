package com.gmail.katryskin;

import java.util.Scanner;

public class Main {
	
	//Вычислить с помощью цикла факториал числа - n введенного с
	//клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
	//этого числа до 1. Например 5!=5*4*3*2*1=120

	public static void main(String[] args) {
		
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
