package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ������� ������ ������ � ���������� � ���������� ��������� ���
		//����������� �������� ���������� ������� � 'b' � ���� ������, � �������
		//��������� �� �����.

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