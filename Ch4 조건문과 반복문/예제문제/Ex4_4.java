
import java.util.Scanner;

public class Ex4_4 {
    // ��� 1 
//	public static void main(String[] args) {
//		
//		int score = 0;  // ������ �����ϱ� ���� ����
//		char grade = ' '; // ������ �����ϱ� ���� ���� �������� �ʱ�ȭ�Ѵ�.
//		
//		System.out.printf("������ �Է��ϼ���.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt(); // ȭ���� ���� �Է¤������� ���ڸ� score�� ����.
//		
//		if (score >= 90 ) { // score 90 �̻��̸�  A����
//			grade = 'A';
//		} else if  (score >= 80){  // score 80�̻� �̸� B����
//			grade = 'B'; 
//		} else if ( score >= 70) { // score 70�̻� �̸�  C����
//			grade = 'C';
//		} else { // �� ��  D 
//			grade = 'D';
//		}
//		System.out.println("����� ������" + grade +"�Դϴ�.");
//		
//
//	}
// 
		
	public static void main(String[] args) {
		//��� 2��
		int score = 0;
		char grade = ' ';
		
		System.out.printf("����� ������ �Է��ϼ���.>");
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
		
		System.out.println("����� ������ "+ grade + "�Դϴ�.�����մϴ�");
		
		
		}
}
