package sec07;

public class ex01_02 {

	public static void main(String[] args) {
		String str = Television.info;
		System.out.println(str);
		//�̱����̶� ������ ������ ��ü�� �����޼ҵ带 �̿��ؼ� ��ӹ�ȯ�Ѵ�
		Television test = Television.getInstance();
		Television test2 = Television.getInstance();
	}

}
// ���̷��� ����~ �̷��� ���±���
class Television {
	static Television single = new Television(); //�̱���
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	private Television() {
		
	}
	
	static Television getInstance() {
		return single;
	}
	
	static {
		info = company +"-"+model;
	}
}