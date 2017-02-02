package com.tinus.main;

import java.util.Scanner;

public class MainBilanganPrima {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		System.out.print("Masukkan jumlah bilangan prima yang ingin ditampilkan: ");
		int x = inputUser.nextInt();
		int counter = 1;
		int bilangan = 0;

		while (counter <= x) {
			bilangan++;
			boolean primaOrNot = cekBilanganPrima(bilangan);
			if (primaOrNot) {
				counter++;
				System.out.println(bilangan);
			} else {
				continue;
			}
		}
	}

	//Method untuk mengecek apakah sebuah bilangan termasuk bilangan prima atau bukan
	public static boolean cekBilanganPrima(int x) {
		if (x == 1 || x == 2) {
			return true;
		} else if (x % 2 == 0) {
			return false;
		} else if (x % 3 == 0 && x != 3) {
			return false;
		} else if (x % 5 == 0 && x != 5) {
			return false;
		} else if (x % 3 == 7 && x != 7) {
			return false;
		} else {
			return true;
		}
	}
}
