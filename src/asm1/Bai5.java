package asm1;

import java.util.Scanner;

public class Bai5 {

	public static void bai5(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chuoi:");
		String str = scan.next();
		
		int length = str.length();
		int halfLength = str.length()/2;
		for(int i = 0; i <= halfLength; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i)) {
				System.out.println("Khong doi xung.");
				break;
			}
			
			if (i == halfLength) {
				System.out.println("Doi xung.");
			}
		}
		
	}

}
