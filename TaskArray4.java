package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ¬ведите строку текста с клавиатуры Ч реализуйте программу дл€
		//возможности подсчета количества символа Ч 'b' в этой строке, с выводом
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