// 기본생성자
class Data_1 {
	int value;
//	Data_1() {} //기본생성자가 자동으로 추가
}
class Data_2{
	int value;
	
	Data_2(){} // 기본생성자 추가해주면 에러가 사라짐 
	Data_2(int x){  // 매개변수가 있는 생성자.
		value = x;
		
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); //compile error발생
		//The constructor Data_2() is undefined
	}
}
