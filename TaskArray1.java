package com.gmail.katryskin;

import java.util.Arrays;

public class Main {
//Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
//нечетных цифр в нем.
	public static void main(String[] args) {
		
		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int n = 0;
		for (int num : a) {
			n = (num % 2 != 0) ? n + 1 : n;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(n);
	}

}
