package com.gmail.katryskin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
