import java.util.Scanner;

public class Ex4_14_2 {

	public static void main(String[] args) {
		
		
		int num = 0 , sum = 0;
		System.out.printf("���� �Է��ϼ���(��:12345)");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ 
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%d num=%d%n", sum , num);
			num /=10;  // num = num / 10 num�� 10���� ���� ���� �ٽ� num�� ���� 
			
		}
		
		
		System.out.println("���ڸ����� ��:"+sum);
		
	}

}
