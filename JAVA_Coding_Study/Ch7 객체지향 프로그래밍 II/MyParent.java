package pkg1;

public class MyParent { // 접근제어자가 default >> public 
	private int   prv;  // 같은 클래스 
	int 	      dft;  // 같은 패키지
	protected int prt;  // 같은 패키지 + 자손(다른 패키지)
	public int    pub;  // 접근제한 없음 .
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}
 class MyParentTest { // 접근제어자가 public >> (default)

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러  (위에 같은 클래스 내에서는 가능하지만 다른 클래스에서 사용하기때문에 에러가 뜨는거다.)
		System.out.println(p.dft); // ok
		System.out.println(p.prt); // ok
		System.out.println(p.pub); // ok

	}

}
