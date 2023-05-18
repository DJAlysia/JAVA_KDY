package 기초05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* java 에서는 시간초과 걸리는 문제 */ 
public class _1430 {

	static int arr[] = new int[10000001];	// 40MB
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = br.read();
		
		for (int i = 0; i < N; i++) {
			int index = br.read();
			if( (char)index != ' ' ) {
				arr[(char) index] = 1;
				System.out.print((char) index + " ");
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = br.read();
		
		for (int i = 0; i < M; i++) {
			int index = br.read();
			if ( (char) index != ' ') {
			bw.write(arr[(char) index] + " ");
		}
		
	}
		bw.flush();
		bw.close();
		
}	
}	
	
	
