package OrientedObjectLanguage;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		// d.x�� ���� ����� ���� �ƴϴ�. change�޼����� �Ű����� x�� ���� ����� ���̴�.
		// ������ �ƴ� ���纻�� ����� ��
		// �⺻�� �Ű������� ������ ����� ���� ���� �� �� ���� �� ������ ���� ����.
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	
	}
	
	static void change(int x){ 
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}