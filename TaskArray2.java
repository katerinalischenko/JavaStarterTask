package com.gmail.katryskin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//�������� ��� ��� ����������� �������� ������� ����� ����� (������
//	��������� � ����������) � ����������� ���������� ������� ��� ��������
//	�������. �������� ���� ������ �� �����.
	
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size.");
		size = sc.nextInt();
		size = (size > 0) ? size : 5;
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Input numbers of array[" + i + "].");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
