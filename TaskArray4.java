package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Введите строку текста с клавиатуры — реализуйте программу для
	//возможности подсчета количества символа — 'b' в этой строке, с выводом
	//результат на экран.

		Scanner sc = new Scanner(System.in);
		System.out.println("Input some English text:");
		String text = sc.nextLine();
		
		int num = 0;
		for (char letter : text.toCharArray()) {
			if (letter == 'b') {
				num += 1;
			}
		}

		System.out.println(num);

		sc.close();
	}
}
