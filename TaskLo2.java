package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	//Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
	//начинается с единицы. На одном этаже 4 квартиры. Напишите программу
	//которая получит номер квартиры с клавиатуры, и выведет на экран на
	//каком этаже, какого подъезда расположенна эта квартира. Если такой
	//квартиры нет в этом доме то нужно сообщить об этом пользователю.
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int flat;
		int floor;
		int porch;
		System.out.println("Input flat number" );
		flat =sc.nextInt();
		if (flat < 1 || flat > 144) {
			System.out.println("There is no flat in this house");
		} else if (flat <= 36) {
			porch = 1;
			floor = (flat + 3)/4;
			System.out.println("Your flat is in "+porch+" porch"+" on the "+floor+" floor.");
		} else if (flat <= 72) {
			porch = 2;
			floor = (flat - 33)/4;
			System.out.println("Your flat is in "+porch+" porch"+" on the "+floor+" floor.");
		} else if (flat <= 108) {
			porch = 3;
			floor = (flat - 69)/4;
			System.out.println("Your flat is in "+porch+" porch"+" on the "+floor+" floor.");
		} else if (flat <= 144) {
			porch = 4;
			floor= (flat - 105)/4;
			System.out.println("Your flat is in "+porch+" porch"+" on the "+floor+" floor.");	
		}
		sc.close();
	}

}
