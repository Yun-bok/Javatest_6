package sec01;

//�ּҷ�(����ó)
public class Address {

	public static void main(String[] args) {
	}
		//�ʵ� - name�̸�, phonenum��ȭ��ȣ,����Ű��ȣ
		String name;
		String phonenum;
		int key;//����Ű
		//������ - �Ű������� 3�� �޾Ƽ� �ʵ� �����ϴ�
		Address(String name,String phonenum,int key){
			this.name = name;
			this.phonenum = phonenum;
			this.key = key;
			
		}
		//������ - �⺻ ������(��)
		Address(){
			
		}
		//�޼��� - �̸� ����, ��ȭ��ȣ ����, ����Ű��ȣ ����,��ȸ
		void Change_Name(String name) {
			this.name = name;
		}
		void Change_PhoneNum(String phone) {
			this.phonenum = phone;
		}
		void Change_key(int key) {
			this.key = key;
		}
		void print() {
			System.out.println("�̸�: "+name+", ��ȭ��ȣ: "+phonenum+"����Ű: "+key);
		}
	
	}


