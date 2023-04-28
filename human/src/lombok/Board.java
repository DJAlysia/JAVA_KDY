package lombok;

import java.util.Date;

// @ : 어노테이션    ( 개발할 때 시간을 엄청나게 줄여줌 = 많이 사용됨 ) 
// @Data
// - @RequiredArgsConstructor, @Getter, @Setter, @EqualsAndHashCode, @ToString			

// @NoArgsConstructor				// 기본 생성자 - 자동 생성
// @AllArgsConstructor				// 모든 매개변수 생성자
// @RequiredArgsConstructor			// 필수 생성자
// @Getter								// getter
// @Setter								// setter
// @ToString							// toString
// @EqualsAndHashCode	
@Data
// @NoArgsConstructor
// @AllRgsConstructor
public class Board {

// 	@NonNull private int boardNo;
	private String title;
	private String content;
	private String writer;
	// Date : 날짜/시간을 다루는 클래스
	private Date regDate;
	private Date updDate;
	
}