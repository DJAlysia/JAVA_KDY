package 기초02;

import java.util.Scanner;

public class _1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time[] = sc.next().split(":");
		
		if(time[1].equals("00"))
			System.out.println("0");
		else
			System.out.println(time[1]);
		sc.close();
	}
}
