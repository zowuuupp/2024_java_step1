package chapter06;

public class AccessTest {
	
	//�������=�ʵ�
	private int aa; //���� Ŭ���������� ���
	public int bb;//���������� ����(�ٸ� Ŭ������ ��Ű������ ��밡��)
	int cc; //public ����

	//����Ʈ ������ ��������
	
	//�޼���
	public void SetAa(int aa) {
		this.aa=aa;
	}
	public void SetBb(int bb) {
		this.bb=bb;
	}
	public void SetCc(int cc) {
		this.cc=cc;
	}
	
	public void Disp() {
		System.out.println("aa��:"+aa+"\nbb��:"+bb+"\ncc��:"+cc);
	}
	
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		//aa �ʱ�ȭ ���
		//#1
		obj.SetAa(20);
		obj.SetBb(30);
		obj.cc=40;
		obj.Disp();
		
		
		
		
	}

}
