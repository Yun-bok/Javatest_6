package sec07;

public class ex01_01 {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = Cal.plus(3, 4);
		Cal.plus(3,4); //������ 3+4
		Cal.mul(3,4);
		
		Cal cal_val = new Cal();
		cal_val.minus(5,3);
		cal_val.div(5,3);

	}

}
////Cal Ŭ����
//����, ����, ����, ������
//���� main�� ������ ������� Ŭ���� �ȿ� �޼ҵ� �ۼ�
class Cal{
	static int plus(int a, int b) {
		return a+b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	int minus(int a, int b) {
		return a-b;
	}
	double div(int a, int b) {
		return a/b;
	}
	//����ƽ���̿��ٰ� �Ѵ�
	
}
