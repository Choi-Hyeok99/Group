
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1백만 = 10의 6제곱
		int b = 2_000_000; // 2,000,000 2백만 = 10의 6제곱
		
		// 10의 12제곱. int의 범위는 10의 9제곱
		
		long c = a * b; // a * b = 2,000,000,000,000 ?  long으로 형변환 해야한다 안그러면 -14~~~~~가 나온다.오버플로우
		
		
		System.out.println(c);
		
		

	}

}
