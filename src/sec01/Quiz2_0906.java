package sec01;

public class Quiz2_0906 {

	public static void main(String[] args) {
		Game game = new Game("ㅁㅁ게임",1,70);
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
			System.out.println("90점이상 levup! ");
		}else if(score>=80) {//레벨첨부?
			lev++;
			System.out.println("80점이상 levup! ");
		}else if(score>=70) {
			lev++;
			System.out.println("70점이상 levup! ");
		}
		
	}
	void lev_down() {
		if(score<80) {
			lev--;
			System.out.println("점수미달 levdown");
		}else if(score<70) {
			System.out.println("점수미달 levdown");
		}
	}
	void score_up() {
		score++;
		System.out.println("2점증가"+(score+1));
		
	}
	void score_down() {
		score--;
		System.out.println("2점감소"+(score-1));
	}
	void print() {
		System.out.println("게임종류는: "+type+"/레벨은: "+lev+"/점수는: "+score);
	}
}



//Game을 지칭하는 클래스 생성
//필드 - type 게임종류, lev 레벨(난이도), score 점수 필드셋
//생성자 -> 게임종류,레벨, score
//메서드 -> lev_up()난이도업, lev_down() 난이도 다운, score_up 점수획득, score_down 점수감소
//print ->게임데이터 출력
//lev_up -> lev++ 1증가  lev 출력
//lev_down -> lev-- 1감소 lev 출력
//score_up -> 2점증가, score출력
//score_down ->2점감소, score출력
//print -> lev 1-> score 90점이상승리
//		-> lev 2-> score 80점이상승리
//		-> lev 3-> score 70점이상승리

