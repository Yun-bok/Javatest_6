package sec01;

public class ex01_ex {

	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.Plus(5, 5);
		float result2 = cal.Plus(3.1f, 3.5f);
		float result3 = cal.Plus(3.1f, 5.5f, 3.3f);
		int result4 = cal.Plus(1, 2, 3, 4);
	}

}

class Cal{
	int Plus(int a,int b) {
		return a+b;//����+�������ؼ� �������� ��ȯ�ض�
	}	
		float Plus(float a, float b) {
			return a+b;
		}
		float Plus(float a, float b, float c) {
			return a+b+c;
		}
		int Plus(int a , int b, int c, int d) {
			return a+b+c+d;
		}
	}
	//���� �������� ������� �޼��� �����ε�(�Ű����� Ÿ��, ����)�� ���� �̸��� �޼��带 ������ּ���


