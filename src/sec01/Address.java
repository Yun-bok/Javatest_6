package sec01;

//주소록(연락처)
public class Address {

	public static void main(String[] args) {
	}
		//필드 - name이름, phonenum전화번호,단축키번호
		String name;
		String phonenum;
		int key;//단축키
		//생성자 - 매개변수를 3개 받아서 필드 저장하는
		Address(String name,String phonenum,int key){
			this.name = name;
			this.phonenum = phonenum;
			this.key = key;
			
		}
		//생성자 - 기본 생성자(빈)
		Address(){
			
		}
		//메서드 - 이름 수정, 전화번호 수정, 단축키번호 수정,조회
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
			System.out.println("이름: "+name+", 전화번호: "+phonenum+"단축키: "+key);
		}
	
	}


