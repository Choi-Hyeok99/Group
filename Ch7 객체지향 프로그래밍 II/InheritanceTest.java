class MyPoint {
	int x;
	int y;
	
}

//class Circle extends MyPoint { // 상속
//	int r;
//}

class Circle {
	MyPoint p = new MyPoint(); // 포함
	int r;
}




public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle(); // 참조변수의 초기화
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.x="+ c.p.x);
		System.out.println("c.y="+ c.p.y);
		System.out.println("c.r="+ c.r);
		}

} 
