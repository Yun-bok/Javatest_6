package sec14;

import java.util.Scanner;

public class Quiz {
//q1
//1~'�Է�'���� �������� 3�� ����� 5�� ����� �����Ѽ����� ����ϰ� ����Ѽ����� ������ ����Ͻÿ�.
//q2
//�������� 9�ܺ��� 1�ܱ��� ����Ͻÿ�.
//q3
//������ �Է¹޾� ������ ���� �࿭�� ����ϼ���
//1 2 3 4
//2 4 6 8
//3 6 9 12
//4 8 12 16
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//q1();
		q3();
	}
	static void q1() {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());//�ް�
		int cnt = 0;
		//3�� 5�� ����� '����'�� �� ��� ����� ������ ����
		//�������� �������� 0�̸�?
		for(int i =0; i<=num; i++) { //1~�Է¹����ű��� 
			if(i%3!=0 && i%5!=0) {
				cnt++;
				
				System.out.println(i);
			}
		}
		System.out.println(cnt);
		
		
		
	}
	
static void q2() {
	for(int j=9;j>1;j--) { //9���� 9876 ������ �ݺ�
		for(int i=9;i>1;i--) {
			System.out.println(i+"��");
			for(int j =1; j<=9; j++) {
				System.out.println(i+"��"+j"��"+i*j);
			}
		}
	}
	
}
static void q3() {
	Scanner input = new Scanner(System.in);
	int num = Integer.parseInt(input.nextLine());
	//��
	for(int i=1; i<=num; i++) {
		//��
		for(int j = 1; j<=num; j++) {
			System.out.print(i*j+" ");
		}
		System.out.println();
	}
		
		
	
			
		}
	
}

