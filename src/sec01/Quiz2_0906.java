package sec01;

public class Quiz2_0906 {

	public static void main(String[] args) {
		Game game = new Game("��������",1,70);
		for(int i = 0; i<20;i++)
		
		game.score_up();
		game.score_down();
		game.print();
	}

}
class Game {
	String type;
	int lev;
	int score;
	
	Game(String type,int lev, int score){
		this.type = type;
		this.lev = lev;
		this.score = score;
	}
	void lev_up(){
		if(score>=90) {
			lev++;
			System.out.println("90���̻� levup! ");
		}else if(score>=80) {//����÷��?
			lev++;
			System.out.println("80���̻� levup! ");
		}else if(score>=70) {
			lev++;
			System.out.println("70���̻� levup! ");
		}
		
	}
	void lev_down() {
		if(score<80) {
			lev--;
			System.out.println("�����̴� levdown");
		}else if(score<70) {
			System.out.println("�����̴� levdown");
		}
	}
	void score_up() {
		score++;
		System.out.println("2������"+(score+1));
		
	}
	void score_down() {
		score--;
		System.out.println("2������"+(score-1));
	}
	void print() {
		System.out.println("����������: "+type+"/������: "+lev+"/������: "+score);
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

