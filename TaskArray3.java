package com.gmail.katryskin;

import java.util.Arrays;

public class Main {
//Создать массив случайных чисел (размером 15 элементов). Создайте
//	второй массив в два раза больше, первые 15 элементов должны быть
//	равны элементам первого массива, а остальные элементы заполнить
//	удвоенных значением начальных. Например
//	Было  {1,4,7,2}
//	Стало  {1,4,7,2,2,8,14,4}
	
	
	public static void main(String[] args) {

		
int []a = {3,7,1,14,12,5,66,2,41,88,12,1,9,0,2};
int []b = new int [30];
for (int i = 0; i < b.length; i++) {
	b[i] = (i < a.length) ? a[i] : a[i - a.length] * 2;
}

System.out.println(Arrays.toString(a));
System.out.print(Arrays.toString(b));
}
	}


