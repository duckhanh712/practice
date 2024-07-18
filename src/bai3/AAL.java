package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class AAL {
	public static void main(String[] args) {
		ArrayList<Double> arrs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Nhap vao: ");

			double x = scanner.nextDouble();
			arrs.add(x);
			scanner.nextLine();

			System.out.println("Y/N");

			String result = scanner.nextLine();
			if (result.equals("N")) {
				break;
			}

		}

		System.out.println("check: " + arrs);

		double total = 0;
		for (int i = 0; i < arrs.size(); i++) {

			total += arrs.get(i);
		}

		System.out.println("" + total);
	}
}
