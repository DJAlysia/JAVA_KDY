package 기초02;

import java.util.Scanner;

public class _1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = Double.toString(sc.nextDouble());
		String[] arr = num.split("\\.");
		System.out.printf("%s\n%s", arr[0], arr[1]);
		sc.close();
	}
}
