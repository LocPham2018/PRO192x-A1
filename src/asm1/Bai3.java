package asm1;

import java.util.Scanner;

public class Bai3 {

	public static void bai3(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Nhap 10 so nguyen:");
		for(int i = 0; i < 10; i++) {
			array[i] = scan.nextInt();
		}
		
		int max = array[0];
		for(int i = 1; i < 10; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max: " + max);
	}

}
