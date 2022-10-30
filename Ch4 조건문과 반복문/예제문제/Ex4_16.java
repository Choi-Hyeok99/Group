
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) { // true 생략 불가, for(;;) 생략 가능  무한 반복문 
			if(sum> 100)
				break;
			++i;
			sum += i;
		}
		System.out.println("i=" +i);
		System.out.println("sum=" + sum);

	}

}
