package pkg1;

public class MyParent { // ���������ڰ� default >> public 
	private int   prv;  // ���� Ŭ���� 
	int 	      dft;  // ���� ��Ű��
	protected int prt;  // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public int    pub;  // �������� ���� .
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}
 class MyParentTest { // ���������ڰ� public >> (default)

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // ����  (���� ���� Ŭ���� �������� ���������� �ٸ� Ŭ�������� ����ϱ⶧���� ������ �ߴ°Ŵ�.)
		System.out.println(p.dft); // ok
		System.out.println(p.prt); // ok
		System.out.println(p.pub); // ok

	}

}
