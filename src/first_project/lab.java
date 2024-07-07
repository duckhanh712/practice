package first_project;

import java.util.Arrays;
import java.util.Scanner;

public class lab {
	public static void main(String[] args) {
		int[] clubs = { 100, 563, 1, 2, 3, 4, 9, 6 };
		int[] newArr = sapxep(clubs);
		System.out.println("Ket qua sai khi sap xep la: ");
		System.out.println(Arrays.toString(newArr));

		double totalWater = numWaterBottles(15, 4);

		System.out.println(totalWater);
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap vao day so:  ");
		int number = scanner.nextInt();
		boolean result = isOpositeNumber(number);
		System.out.println("Is " + number + " an opposite number? " + result);

		scanner.close();

	}

	public static int[] sapxep(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}

		return array;
	}

	public static int numWaterBottles(int numBottles, int numExchange) {
		int total = numBottles;
		int k = numBottles;

		for (int i = 0; i < k; i++) {
			int times = k / numExchange;
			int phandu = k % numExchange;
			if (times > 0) {
				total = total + times;

				k = phandu > 0 ? phandu + times : times;
			}
		}

		return total;
	}

	public static boolean isOpositeNumber(int number) {
		boolean isOp = true;
		String numberStr = Integer.toString(Math.abs(number));
		int countChar = numberStr.length();
		int isOdd = countChar % 2;

		int point = (countChar - isOdd == 0 ? 0 : 1) / 2;
		String A = numberStr.substring(0, point);

		String B = new StringBuilder(numberStr.substring(point + isOdd == 0 ? 0 : 1)).reverse().toString();

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				isOp = false;
				break;
			}
		}

		return isOp;

	}

//	public static int[] numberToArray(int number) {
//
//		String numberStr = Integer.toString(number);
//
//		int[] result = new int[numberStr.length()];
//
//		for (int i = 0; i < numberStr.length(); i++) {
//			result[i] = numberStr.charAt(i) - '0';
//		}
//
//		return result;
//	}

}
