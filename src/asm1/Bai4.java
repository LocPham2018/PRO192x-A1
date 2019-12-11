package asm1;

import java.util.Scanner;

public class Bai4 {

	public static void bai4(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Nhap 10 so nguyen:");
		for(int i = 0; i < 10; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Mang dao nguoc:");
		for(int i = 9; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
