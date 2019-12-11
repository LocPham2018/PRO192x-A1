package asm1;

import java.util.Scanner;

public class Bai1 {

	public static void bai1(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap 3 so: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		if (c > max) {
			max = c;
		}
		else if (c < min) {
			min = c;
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}
