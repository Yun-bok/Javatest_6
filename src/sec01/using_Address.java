package sec01;

import java.util.Scanner;

public class using_Address {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Address addr = null;
		Start:while(true) {
			System.out.println("1. ����ó ���, 2.�̸� ����,"
					+ " 3. ��ȭ��ȣ ����, 4.����Ű ����, 5.��ȸ, 6. ����");
			int num = Integer.parseInt(input.nextLine());
			
			switch(num) {
			case 1:
				addr = new Address("�̴���","010-2431-3236",0);
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
