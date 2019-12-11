package asm1;

import java.util.Scanner;

public class Bai2 {

	public static void bai2(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap 3 canh cua tam giac: ");
		int canh1 = scan.nextInt();
		int canh2 = scan.nextInt();
		int canh3 = scan.nextInt();
		
		if (canh1 == canh2 && canh1 == canh3) {
			System.out.println("Tam giac deu.");
		}
		else if (canh1 == canh2 || canh2 == canh3 || canh3 == canh1) {
			System.out.println("Tam giac can.");
		}
		else {
			System.out.println("Tam giac thuong.");
		}
	}

}
