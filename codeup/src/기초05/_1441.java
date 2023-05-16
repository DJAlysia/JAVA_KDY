package 기초05;
import java.util.Scanner;

public class _1441 {

	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	        arr[i] = sc.nextInt();
	    }

	    // 버블 정렬
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // 인접한 두 수 비교 후 교환
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }

	    // 정렬된 배열 출력
	            for (int i = 0; i < n; i++) {
	            System.out.println(arr[i] + " ");
	            }   
	            sc.close();
         }
	}

