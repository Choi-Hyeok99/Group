package pkg2;

import pkg1.MyParent;

// import pkg1.MyParent;  // ctrl + shift + o 

class MyChild extends pkg1.MyParent {
	
	public void printMembers() { 
//		System.out.println(prv); //���� 
//		System.out.println(dft); //����
		System.out.println(prt); //ok
		System.out.println(pub); //ok 
	}
	
}



public class MyParentTest2 {

	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv); // ����  (���� ���� Ŭ���� �������� ���������� �ٸ� Ŭ�������� ����ϱ⶧���� ������ �ߴ°Ŵ�.)
//		System.out.println(p.dft); // ����
//		System.out.println(p.prt); // ����
		System.out.println(p.pub); // ok // �������� ����
	}

}
