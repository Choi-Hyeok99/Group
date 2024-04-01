package pkg2;

import pkg1.MyParent;

// import pkg1.MyParent;  // ctrl + shift + o 

class MyChild extends pkg1.MyParent {
	
	public void printMembers() { 
//		System.out.println(prv); //에러 
//		System.out.println(dft); //에러
		System.out.println(prt); //ok
		System.out.println(pub); //ok 
	}
	
}



public class MyParentTest2 {

	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 에러  (위에 같은 클래스 내에서는 가능하지만 다른 클래스에서 사용하기때문에 에러가 뜨는거다.)
//		System.out.println(p.dft); // 에러
//		System.out.println(p.prt); // 에러
		System.out.println(p.pub); // ok // 접근제한 없음
	}

}
