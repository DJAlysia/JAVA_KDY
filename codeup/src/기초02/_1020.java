package 기초02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yymmdd = sc.nextLine();
		StringTokenizer st = new StringTokenizer(yymmdd, "-");
		int[] arr = new int[st.countTokens()];
		for(int i = 0; st.hasMoreTokens(); i++)
			arr[i] = Integer.parseInt(st.nextToken());
		System.out.printf("%06d%7d", arr[0], arr[1]);
		sc.close();
	}
}
