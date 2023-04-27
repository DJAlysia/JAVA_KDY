package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {

	public static void main(String[] args) {
		
		// 스트림
		// : 실제 입력이나 출력이 표현된 데이터 흐름
		
		// 입력 받을 수 있는 데이터
		// : 키보드로부터 입력한 키, 파일 등
		
		// (키보드), (파일) ---> [스트림] ---> [프로그램]
		
		// 입력 스트림 클래스		: InputStream
		// 파일 스트림 클래스		: FileInputStream
		FileInputStream fis = null;
		
		try {
			// test.txt 파일을 입력할 수 있도록 연결
			fis = new FileInputStream("test.txt");
			
			int read = 0;
			
			// fis.read()	: .txt 파일의 데이터를 한 글자씩 읽어오는 메소드
			//					- 더 이상 읽어올 데이터가 없으면 -1 을 반환
			while( (read = fis.read()) != -1 )
				System.out.print( (char) read );
		}	
		 catch (FileNotFoundException e) {
			 // FileNotFoundException : 파일이 없을 때 발생하는 예외
			e.printStackTrace();	// 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
			System.err.println("파일을 찾을 수 없습니다.");
		}
			catch (IOException e) {
				// IOException : 입출력 과정에서 문제 시 발생하는 예외
				e.printStackTrace();
				System.err.println("입출력 관련 예외 발생");
		}
		
		// 메모리 자원해제를 finally 에서 주로 하여 작성하였지만 자동으로 해제 하는 방법을 문법 안에 작성하면 굳이 작성 필요 없음 (try-with-resouces)
			finally {						// finally 없이도 작성 가능하지만 finally 안에서는 외부 자원에서 가져온 메모리를 해제하는 것으로 작성
				if( fis != null) {
					try {
						fis.close();		// scanner close 와 같이 메모리에서 해제를 시켜줌
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}
}
