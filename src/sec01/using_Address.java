package sec01;

import java.util.Scanner;

public class using_Address {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Address addr = null;
		Start:while(true) {
			System.out.println("1. 연락처 등록, 2.이름 수정,"
					+ " 3. 전화번호 수정, 4.단축키 수정, 5.조회, 6. 종료");
			int num = Integer.parseInt(input.nextLine());
			
			switch(num) {
			case 1:
				addr = new Address("이대현","010-2431-3236",0);
				break;
			case 2:
				if(addr!=null) {
					String name = input.nextLine();
					addr.Change_Name(name);
				}
				break;
			case 3:
				if(addr!=null) {
					String phone_num = input.nextLine();
					addr.Change_PhoneNum(phone_num);
				}
				break;
			case 4:
				if(addr!=null) {
					int key = Integer.parseInt(input.nextLine());
					addr.Change_key(key);
				}
			case 5:
				if(addr!=null) {
					addr.print();
				}
				break;
			case 6:
				break Start;
			}
		}

	}

}
