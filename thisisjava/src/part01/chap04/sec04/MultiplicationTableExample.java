package part01.chap04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
				if (i==2) {
					System.out.println("*** " + i + "단 ***" );
				}
				else {
					System.out.println("\n" + "*** " + i + "단 ***" );

				}
			for (int j = 1; j <=9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}
}
