package asm1;

import java.util.Scanner;

public class Bai8 {

	public static void bai8(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i;
		int P = 0;
		
		System.out.println("Nhap so bat ky:");
		do {
			i = scan.nextInt();
			P += i;
		} while (i != 0);
		
		System.out.println("Tong cac so da nhap la " + P);
	}

}
