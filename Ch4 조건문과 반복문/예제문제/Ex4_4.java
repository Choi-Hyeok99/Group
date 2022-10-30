
import java.util.Scanner;

public class Ex4_4 {
    // 방법 1 
//	public static void main(String[] args) {
//		
//		int score = 0;  // 점수를 저장하기 위한 변수
//		char grade = ' '; // 학점을 저장하기 위한 변수 공백으로 초기화한다.
//		
//		System.out.printf("점수를 입력하세여.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt(); // 화면을 통해 입력ㅂ다은ㄴ 숫자를 score에 저장.
//		
//		if (score >= 90 ) { // score 90 이상이면  A학점
//			grade = 'A';
//		} else if  (score >= 80){  // score 80이상 이면 B학점
//			grade = 'B'; 
//		} else if ( score >= 70) { // score 70이상 이면  C학점
//			grade = 'C';
//		} else { // 그 외  D 
//			grade = 'D';
//		}
//		System.out.println("당신의 학점은" + grade +"입니다.");
//		
//
//	}
// 
		
	public static void main(String[] args) {
		//방식 2번
		int score = 0;
		char grade = ' ';
		
		System.out.printf("당신의 점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}else if (80 <= score && score < 90) {
			grade = 'B';
		}else if ( 70 <= score && score < 80) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 "+ grade + "입니다.감사합니다");
		
		
		}
}
