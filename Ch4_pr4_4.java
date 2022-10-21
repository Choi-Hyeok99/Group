public class Ch4_pr4_4 {

	public static void main(String[] args) {


		int sum = 0;
		int s = 1;
		int num = 0;
		
		for(int i = 1; true; i++ , s=-s) { //순서가 int i 검사 > true 검사 > 밑에 실행 > 올라와서 i++ ,s=-s 하고 다시 ㄱㄱ
			
			num = s*i;
			sum += num;
			
		if(sum>=100)
			break;
	
		}
		
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		
			
		}
			

	}


