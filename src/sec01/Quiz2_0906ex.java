package sec01;

import java.util.Scanner;

public class Quiz2_0906ex {

	public static void main(String[] args) {
		Game game = null; //null �ƹ��͵� ���� ����ִ� ->�����ϴ� �ּҰ��� ������
		while(true) {
			System.out.println("1. ����Ŭ���� ����, 2. ��ȸ,3.���̵� ���� 4. ��������,5. ����");
			Scanner input = new Scanner(System.in);
			
			int num = Integer.parseInt(input.nextLine());
			
			if(num==1 ) {
				String game_name = input.nextLine();
				int game_lev = Integer.parseInt(input.nextLine());
				int game_score = Integer.parseInt(input.nextLine());
				game = new Game(game_name,game_lev,game_score);
			}else if(num==2) {
				game.print();
			}else if(num==3) {
				System.out.println("1. ���̵���,2. ���̵��ٿ�");
				int num2 = Integer.parseInt(input.nextLine());
				if(num2==1) {
					game.lev_up();//1�Է��ϸ� ���̵� ��
				}else if(num2==2) {
					game.lev_down();
				}
			}else if(num==4) {
				System.out.println("1. ��������, 2. ���� ����");
				int num2 = Integer.parseInt(input.nextLine());
				if(num2==1) {
					game.score_up();
				}else if(num2==2) {
					game.score_down();
				}
			}else if(num==5) {
				System.out.println("����");
				break;
			}
		}
		

	}
	

//Game�� ��Ī�ϴ� Ŭ���� ����
//�ʵ� - type ��������, lev ����(���̵�), score ���� �ʵ��
//������ -> ��������,����, score


//�޼��� -> lev_up()���̵���, lev_down() ���̵� �ٿ�, score_up ����ȹ��, score_down ��������
//print ->���ӵ����� ���
//lev_up -> lev++ 1����  lev ���
//lev_down -> lev-- 1���� lev ���
//score_up -> 2������, score���
//score_down ->2������, score���
//print -> lev 1-> score 90���̻�¸�
//		-> lev 2-> score 80���̻�¸�
//		-> lev 3-> score 70���̻�¸�
}

