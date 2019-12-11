package asm1;

import java.util.Scanner;

public class Bai7 {

	public static void bai7(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		int[] B = new int[5];
		
		System.out.println("Nhap mang A:");
		for(int i = 0; i < 5; i++) {
			A[i] = scan.nextInt();
		}
		System.out.println("Nhap mang B:");
		for(int i = 0; i < 5; i++) {
			B[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			if (A[i] != B[i]) {
				System.out.println("Khac nhau o phan tu " + (i + 1));
				break;
			}
			
			if (i == 4) {
				System.out.println("Giong nhau.");
			}
		}
	}

}
